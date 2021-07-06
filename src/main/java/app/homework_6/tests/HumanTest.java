package app.homework_6.tests;

import app.homework_6.main.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HumanTest {
    @Test
    public void should_returnCertainString_when_calledToStringMethod() {
        //given
        Human human = new Human("Michael", "Velychkevych", 1991);
        String result = human.toString();
        //when
        String expected = "Human{name='Michael', surname='Velychkevych', year=1991, iq=0, schedule=null}";
        //then
        Assertions.assertEquals(expected, result);
    }
}