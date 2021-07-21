package app.homework_9.main.model;

public class RoboCat extends app.homework_9.main.model.Pet implements app.homework_9.main.model.Animal {
    public RoboCat(String name) {
        super(name);
        super.setSpecies(app.homework_9.main.model.Species.CAT);
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
