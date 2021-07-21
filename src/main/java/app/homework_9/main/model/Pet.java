package app.homework_9.main.model;

import java.util.Set;

public abstract class Pet {
    private app.homework_9.main.model.Species species;
    private String nickname;
    private int age;
    private byte trickLevel;
    private Set<String> habits;

    public app.homework_9.main.model.Species getSpecies() {
        return species;
    }

    public void setSpecies(app.homework_9.main.model.Species species) {
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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    void eat() {
        System.out.println("Я кушаю!");
    }

    abstract void respond();

    public Pet() {

    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, byte trickLevel, Set<String> habits) {
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
                ", habits=" + habits +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println("Pet will be removed");
    }
}