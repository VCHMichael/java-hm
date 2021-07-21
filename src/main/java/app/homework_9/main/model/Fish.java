package app.homework_9.main.model;

public class Fish extends app.homework_9.main.model.Pet {
    public Fish(String name) {
        super(name);
        super.setSpecies(app.homework_9.main.model.Species.FISH);
    }

    @Override
    void respond() {
        System.out.printf("Привет, хозяин. Я рыба. Я - %s. Я соскучился! \n", this.getNickname());
    }


}
