package app.homework_9.main.model;

public class Dog extends app.homework_9.main.model.Pet implements app.homework_9.main.model.Animal {

    public Dog(String name) {
        super(name);
        super.setSpecies(app.homework_9.main.model.Species.DOG);
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
