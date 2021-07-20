package app.homework_8.main.model;

import app.homework_8.main.model.Animal;
import app.homework_8.main.model.Pet;
import app.homework_8.main.model.Species;

public class DomesticCat extends Pet implements Animal {
    public DomesticCat(String name) {
        super(name);;
        super.setSpecies(Species.UNKNOWN);
    }
    @Override
    void respond() {
        System.out.printf("Привет, хозяин. Я Доместос-Кот. Я - %s. Я соскучился! \n", this.getNickname());
    }

    @Override
    public void foul() {
            System.out.println("Нужно хорошо замести следы...Возьму доместос");
    }
}
