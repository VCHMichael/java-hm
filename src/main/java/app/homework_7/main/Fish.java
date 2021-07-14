package app.homework_7.main;

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
