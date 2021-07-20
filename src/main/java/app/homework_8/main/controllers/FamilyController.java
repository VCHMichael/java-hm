package app.homework_8.main.controllers;

import app.homework_8.main.model.Family;
import app.homework_8.main.model.Human;
import app.homework_8.main.model.Pet;
import app.homework_8.main.services.FamilyService;

import java.util.List;

public class FamilyController {
    FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }
    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public Family getFamilyByIndex(int index) {
        return familyService.getFamilyByIndex(index);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyService.deleteFamilyByIndex(index);
    }

    public boolean deleteFamilyByFamily(Family family) {
        return familyService.deleteFamilyByFamily(family);
    }

    public void saveFamily(Family family) {
        familyService.saveFamily(family);
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int people) {
        familyService.getFamiliesBiggerThan(people);
    }

    public void getFamiliesLessThan(int people) {
        familyService.getFamiliesLessThan(people);
    }

    public int countFamiliesWithMemberNumber(int number) {
        return familyService.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human firstPerson, Human secondPerson) {
        familyService.createNewFamily(firstPerson, secondPerson);
    }

    public Family bornChild(Family family, String fatherName, String motherName) {
        return familyService.bornChild(family, fatherName, motherName);
    }

    public Family adoptChild(Family family, Human adoptPerson) {
        return familyService.adoptChild(family, adoptPerson);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Pet getPets(int familyIndex) {
        return familyService.getPets(familyIndex);

    }

    public void addPet(int indexFamily, Pet pet) {
        familyService.addPet(indexFamily, pet);
    }
}
