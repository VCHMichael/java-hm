package app.homework_6.main;

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
