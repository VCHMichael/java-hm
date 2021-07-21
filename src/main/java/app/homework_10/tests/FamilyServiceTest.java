package app.homework_10.tests;

import app.homework_10.main.controllers.FamilyController;
import app.homework_10.main.dao.CollectionFamilyDao;
import app.homework_10.main.model.Family;
import app.homework_10.main.model.Human;
import app.homework_10.main.services.FamilyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FamilyServiceTest {
    FamilyService instanceService = new FamilyService(new CollectionFamilyDao());
    FamilyController instanceController = new FamilyController(instanceService);
    Human human = new Human();
    Human human2 = new Human();
    @Test
    public void should_returnFamilyList_when_call_getAllFamilies(){
        List<Family> families = new ArrayList<>();
        Assertions.assertEquals(families, instanceController.getAllFamilies());
    }
    @Test
    public void should_getNull_when_call_getFamilyByIndex_InEmptyList(){
        //given
        //when
        Family result = instanceController.getFamilyByIndex(0);
        //then
        Assertions.assertNull(result);
    }
    @Test
    public void should_getFalse_when_deleteFamilyByIndex_inEmptyList(){
        //given
        boolean result = instanceController.deleteFamilyByIndex(0);
        //when
        //then
        Assertions.assertFalse(result);
    }
}
