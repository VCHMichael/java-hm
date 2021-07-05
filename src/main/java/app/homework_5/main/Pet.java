package app.homework_5.main;

import java.util.Arrays;

class Pet {
    private Species species;
    private String nickname;
    private int age;
    private byte trickLevel;

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(byte trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    private String[] habits;

    void eat() {
        System.out.println("Я кушаю!");
    }

    void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился! \n", this.nickname);
    }

    void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    public Pet() {

    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
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

    @Override
    protected void finalize() {
        System.out.println("Pet will be removed");
    }
}

enum Species {
    DOG,
    CAT,
    TIGER
}