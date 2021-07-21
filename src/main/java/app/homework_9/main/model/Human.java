package app.homework_9.main.model;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private String childBirth;
    private int iq;
    private Map<app.homework_9.main.model.DayOfTheWeek, ArrayList<String>> schedule;
    private app.homework_9.main.model.Family family;

    public Human() {

    }

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, long birthDate, int iq, Map<app.homework_9.main.model.DayOfTheWeek, ArrayList<String>> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, String childBirth, int iq) {
        this.name = name;
        this.surname = surname;
        this.childBirth = childBirth;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public app.homework_9.main.model.Family getFamily() {
        return family;
    }

    public void setFamily(app.homework_9.main.model.Family family) {
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public Map<app.homework_9.main.model.DayOfTheWeek, ArrayList<String>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<app.homework_9.main.model.DayOfTheWeek, ArrayList<String>> schedule) {
        this.schedule = schedule;
    }

    void greetPet() {
        System.out.printf("Привет, %s \n", family.getPet().getNickname());
    }

    void describePet() {
        String isTrickyText = family.getPet().getTrickLevel() > 50 ? "Очень хитрый" : "Почти не хитрый";
        System.out.printf("У меня есть %s, ему %s лет, он %s \n", family.getPet().getSpecies(), family.getPet().getAge(), isTrickyText);
    }

    public String describeAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDay = Instant.ofEpochMilli(birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        Period diff = Period.between(birthDay, currentDate);
        return String.format("Years: %s, Months: %s, Days: %s,", diff.getYears(), diff.getMonths(), diff.getDays());
    }

    private String formatDate() {
        LocalDate birthDay = Instant.ofEpochMilli(birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate result = LocalDate.of(birthDay.getYear(), birthDay.getMonth(), birthDay.getDayOfMonth());
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(result);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + formatDate() +
                ", childBirth='" + childBirth + '\'' +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println("Human will be removed");
    }
}
