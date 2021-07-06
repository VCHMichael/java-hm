package app.homework_6.main;

import java.util.Arrays;

abstract class Pet {
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

    abstract void respond();

    public Pet() {

    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, byte trickLevel, String[] habits) {
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
    FISH,
    UNKNOWN,
}

interface Animal {
    public void foul();
}