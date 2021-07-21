package app.homework_9.main.model;

public class DomesticCat extends app.homework_9.main.model.Pet implements app.homework_9.main.model.Animal {
    public DomesticCat(String name) {
        super(name);;
        super.setSpecies(app.homework_9.main.model.Species.UNKNOWN);
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
