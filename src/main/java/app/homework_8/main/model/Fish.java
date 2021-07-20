package app.homework_8.main.model;

import app.homework_8.main.model.Pet;
import app.homework_8.main.model.Species;

public class Fish extends Pet {
    public Fish(String name) {
        super(name);
        super.setSpecies(Species.FISH);
    }

    @Override
    void respond() {
        System.out.printf("Привет, хозяин. Я рыба. Я - %s. Я соскучился! \n", this.getNickname());
    }


}
