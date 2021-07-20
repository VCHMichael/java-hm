package app.homework_8.main.model;

import app.homework_8.main.model.Animal;
import app.homework_8.main.model.Pet;
import app.homework_8.main.model.Species;

public class Dog extends Pet implements Animal {

    public Dog(String name) {
        super(name);
        super.setSpecies(Species.DOG);
    }

    @Override
    void respond() {
        System.out.printf("Привет, хозяин. Я твой пес. Я - %s. Я соскучился! \n", this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Зря я так с тумбочкой...");
    }
}
