package app.homework_9.main.model;

public final class Man extends app.homework_9.main.model.Human {
    @Override
    void greetPet() {
        System.out.println("Привет, друг!!!!");
    }

    public void repairCar() {
        System.out.println("Что-то барахлит авто, пойду гляну...");
    }
}
