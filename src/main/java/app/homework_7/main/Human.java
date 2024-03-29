package app.homework_7.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfTheWeek, ArrayList<String>> schedule;
    private Family family;

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Map<DayOfTheWeek, ArrayList<String>> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
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

    public int getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public Map<DayOfTheWeek, ArrayList<String>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfTheWeek, ArrayList<String>> schedule) {
        this.schedule = schedule;
    }

    void greetPet() {
        System.out.printf("Привет, %s \n", family.getPet().getNickname());
    }

    void describePet() {
        String isTrickyText = family.getPet().getTrickLevel() > 50 ? "Очень хитрый" : "Почти не хитрый";
        System.out.printf("У меня есть %s, ему %s лет, он %s \n", family.getPet().getSpecies(), family.getPet().getAge(), isTrickyText);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
    @Override
    protected void finalize() {
        System.out.println("Human will be removed");
    }
}

enum DayOfTheWeek{
    SUNDAY ("Воскресенье"),
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота");

    private final String title;

    DayOfTheWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}