package app.homework_7.main;


public class homework_7 {
    public static void main(String[] args) {
        Fish fish = new Fish("GoldFish");
        fish.eat();
        fish.respond();
        DomesticCat domesticCat = new DomesticCat("Domestos CAT!");
        domesticCat.foul();
        domesticCat.respond();
        Dog dog = new Dog("Bobik");
        dog.foul();
        dog.respond();
        System.out.println(dog);
        RoboCat roboCat = new RoboCat("Tech");
        roboCat.foul();
        roboCat.respond();
        Man man = new Man();
        man.repairCar();
        Woman woman = new Woman();
        woman.makeup();
    }
}

