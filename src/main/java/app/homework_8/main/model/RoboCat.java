package app.homework_8.main.model;

public class RoboCat extends Pet implements Animal {
    public RoboCat(String name) {
        super(name);
        super.setSpecies(Species.CAT);
    }
    @Override
    void respond() {
        System.out.printf("Привет, хозяин. Я твой robot-cat. Я - %s. Я соскучился! \n", this.getNickname());

    }

    @Override
    public void foul() {
        System.out.print("Проводка сгорела, черт!");
    }
}
