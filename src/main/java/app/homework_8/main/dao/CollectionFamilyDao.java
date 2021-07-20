package app.homework_8.main.dao;

import app.homework_8.main.model.Family;
import app.homework_8.main.model.Human;
import app.homework_8.main.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao {
    private static final List<Family> families = new ArrayList<>();
    private static final int CURRENT_YEAR = 2021;

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return index >= families.size() ? null : families.get(index);
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        if (index >= families.size()) {
            return false;
        } else {
            families.remove(index);
            return true;
        }

    }

    @Override
    public boolean deleteFamilyByFamily(Family family) {
        if (families.contains(family)) {
            families.remove(family);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void saveFamily(Family family) {
        if (families.contains(family)) {
            int existedIndex = families.indexOf(family);
            families.set(existedIndex, family);
        } else {
            families.add(family);
        }

    }

    @Override
    public void displayAllFamilies() {
        System.out.println(families);
    }

    @Override
    public void getFamiliesBiggerThan(int people) {
        List<Family> result = families.stream().filter((family) -> family.countFamily() > people).collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    @Override
    public void getFamiliesLessThan(int people) {
        List<Family> result = families.stream().filter((family) -> family.countFamily() < people).collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    @Override
    public int countFamiliesWithMemberNumber(int number) {
        List<Family> result = families.stream().filter((family) -> family.countFamily() == number).collect(Collectors.toList());
        return result.size();
    }

    @Override
    public void createNewFamily(Human firstPerson, Human secondPerson) {
        Family family = new Family(firstPerson, secondPerson);
        families.add(family);
    }

    @Override
    public Family bornChild(Family family, String fatherName, String motherName) {
        int index = families.indexOf(family);
        Family searchedFamily = families.get(index);
        boolean isBoy = Math.random() < 0.5;
        Human child = new Human();
        child.setName(isBoy ? fatherName : motherName);
        searchedFamily.addChild(child);
        families.set(index, searchedFamily);
        return searchedFamily;
    }

    @Override
    public Family adoptChild(Family family, Human adoptPerson) {
        int index = families.indexOf(family);
        Family searchedFamily = families.get(index);
        searchedFamily.addChild(adoptPerson);
        families.set(index, searchedFamily);
        return searchedFamily;
    }

    @Override
    public void deleteAllChildrenOlderThen(int age) {
        List<Family> familiesWithChildren = families.stream().filter((family) -> family.getChildren().size() > 0).collect(Collectors.toList());
        familiesWithChildren.forEach(family -> family.getChildren().forEach(child -> {
            if (CURRENT_YEAR - child.getYear() > age) {
                int indexChild = family.getChildren().indexOf(child);
                family.deleteChild(indexChild);
            }
        }));
    }

    @Override
    public int count() {
        return families.size();
    }

    @Override
    public Pet getPets(int familyIndex) {
        Family searchedFamily = families.get(familyIndex);
        return searchedFamily.getPet();
    }

    @Override
    public void addPet(int indexFamily, Pet pet) {
        Family searchedFamily = families.get(indexFamily);
        searchedFamily.setPet(pet);
    }
}
