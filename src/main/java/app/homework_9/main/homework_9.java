package app.homework_9.main;

import app.homework_9.main.model.Human;


import java.sql.Timestamp;

public class homework_9 {
    public static void main(String[] args) {
        long ts = System.currentTimeMillis() / 1000L;
        Human human = new Human("Michael", "Clime", ts);
        System.out.println(human.describeAge());
        System.out.println(human);
    }
}

