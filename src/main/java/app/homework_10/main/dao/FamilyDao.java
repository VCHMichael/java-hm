package app.homework_10.main.dao;

import app.homework_10.main.model.Family;
import app.homework_10.main.model.Human;
import app.homework_10.main.model.Pet;

import java.util.List;

public interface FamilyDao {
    public  List<Family> getAllFamilies();

    public Family getFamilyByIndex(int index);

    public  boolean deleteFamilyByIndex(int index);

    public  boolean deleteFamilyByFamily(Family family) ;

    public  void saveFamily(Family family);

    public void displayAllFamilies();

    public void getFamiliesBiggerThan(int people);

    public void getFamiliesLessThan(int people);

    public int countFamiliesWithMemberNumber(int number);

    public void createNewFamily(Human firstPerson, Human secondPerson);

    public Family bornChild(Family family, String fatherName, String motherName);

    public Family adoptChild(Family family, Human adoptPerson);

    public void deleteAllChildrenOlderThen(int age);

    public int count();

    public Pet getPets(int familyIndex);

    public void addPet(int indexFamily, Pet pet);

}
