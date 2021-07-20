package app.homework_8.main.model;

public final class Man extends Human {
    @Override
    void greetPet() {
        System.out.println("Привет, друг!!!!");
    }

    public void repairCar() {
        System.out.println("Что-то барахлит авто, пойду гляну...");
    }
}
