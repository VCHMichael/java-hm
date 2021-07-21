package app.homework_10.main.services;

import app.homework_10.main.dao.FamilyDao;
import app.homework_10.main.model.Family;
import app.homework_10.main.model.Human;
import app.homework_10.main.model.Pet;

import java.util.List;

public class FamilyService {
    FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public Family getFamilyByIndex(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamilyByIndex(index);
    }

    public boolean deleteFamilyByFamily(Family family) {
        return familyDao.deleteFamilyByFamily(family);
    }

    public void saveFamily(Family family) {
        familyDao.saveFamily(family);
    }

    public void displayAllFamilies() {
        familyDao.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int people) {
        familyDao.getFamiliesBiggerThan(people);
    }

    public void getFamiliesLessThan(int people) {
        familyDao.getFamiliesLessThan(people);
    }

    public int countFamiliesWithMemberNumber(int number) {
        return familyDao.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human firstPerson, Human secondPerson) {
        familyDao.createNewFamily(firstPerson, secondPerson);
    }

    public Family bornChild(Family family, String fatherName, String motherName) {
        return familyDao.bornChild(family, fatherName, motherName);
    }

    public Family adoptChild(Family family, Human adoptPerson) {
        return familyDao.adoptChild(family, adoptPerson);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyDao.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyDao.count();
    }

    public Pet getPets(int familyIndex) {
        return familyDao.getPets(familyIndex);

    }

    public void addPet(int indexFamily, Pet pet) {
        familyDao.addPet(indexFamily, pet);
    }
}
