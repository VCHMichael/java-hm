package app.homework_8.main;


import app.homework_8.main.controllers.FamilyController;
import app.homework_8.main.dao.CollectionFamilyDao;
import app.homework_8.main.model.Human;
import app.homework_8.main.services.FamilyService;

public class homework_8 {
    public static void main(String[] args) {
        FamilyService instanceService = new FamilyService(new CollectionFamilyDao());
        FamilyController instanceController = new FamilyController(instanceService);
        Human human = new Human();
        Human human2 = new Human();
        instanceController.createNewFamily(human, human2);
        instanceController.count();
        instanceController.displayAllFamilies();
    }
}

