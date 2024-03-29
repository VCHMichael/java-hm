package app.homework_10.tests;

import app.homework_10.main.model.Family;
import app.homework_10.main.model.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FamilyTest {
    Human mother = new Human();
    Human father = new Human();
    Human child = new Human();
    Family family = new Family(mother, father);
    @Test
    public void should_deleteChild_from_children_when_deleteChild_Called() {
        //given
        family.addChild(child);
        //when
        boolean result = family.deleteChild(0);
        //then
        Assertions.assertEquals(0, family.getChildren().size());
        Assertions.assertTrue(result);
    }
    @Test
    public void should_children_stay_equals_when_index_isInvalid(){
        //when
        family.deleteChild(5);
        //then
        Assertions.assertEquals(0, family.getChildren().size());
    }
    @Test
    public void should_add_child_when_called_addChild_method(){
        //when
        family.addChild(child);
        Human expected = family.getChildren().get(0);
        //then
        Assertions.assertEquals(1, family.getChildren().size());
        Assertions.assertEquals(expected, child);
    }
    @Test
    public void should_return_correct_count_when_called_countFamily(){
        //when
        int result = family.countFamily();
        //then
        Assertions.assertEquals(2, result);
    }
}