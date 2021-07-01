package app;

import java.util.ArrayList;
import java.util.Arrays;

public class homework04 {
    public static void main(String[] args) {
        Human father = new Human("Michael", "Vel", 1991);
        Human mother = new Human("Olha", "Vel", 1992);
        Human children = new Human("Emilia", "Vel", 2019);
        Pet cat = new Pet("Cat", "Armi");
        Family family = new Family(mother, father);
        family.addChild(children);
        family.addPet(cat);
        cat.respond();
        System.out.println(family);
        System.out.println(father);
    }
}

class Pet {
    String species;
    String nickname;
    int age;
    byte trickLevel;
    String[] habits;

    void eat() {
        System.out.println("Я кушаю!");
    }

    void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился! \n", this.nickname);
    }

    void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public String toString() {
        return this.species + "{" +
                "nickname = '" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public Pet() {

    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
}

class Human {
    private String name;
    private String surname;
    private int year;
    private byte iq;
    private Human mother;
    private Human father;
    private int[][] schedule;
    private Family family;

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, byte iq, Human mother, Human father, int[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public int[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(int[][] schedule) {
        this.schedule = schedule;
    }

    void greetPet() {
        System.out.printf("Привет, %s \n", family.pet.nickname);
    }

    void describePet() {
        String isTrickyText = family.pet.trickLevel > 50 ? "Очень хитрый" : "Почти не хитрый";
        System.out.printf("У меня есть %s, ему %s лет, он %s \n", family.pet.species, family.pet.age, isTrickyText);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}

class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family() {

    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        mother.setFamily(this);
        father.setFamily(this);

    }

    void addChild(Human child) {
        ArrayList<Human> newList = new ArrayList<>(Arrays.asList(children));
        child.setFamily(this);
        newList.add(child);
        children = newList.toArray(children);
    }

    boolean deleteChild(int i) {
        if (children == null
                || i < 0
                || i >= children.length) {

            return false;
        }
        ArrayList<Human> newList = new ArrayList<>(Arrays.asList(children));
        newList.remove(i);
        children = newList.toArray(children);
        return true;
    }

    int countFamily() {
        return children.length + 2;
    }

    void addPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}