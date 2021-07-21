package app.homework_10.main;


import app.homework_10.main.model.Human;

public class homework_9 {
    public static void main(String[] args) {
        long ts = System.currentTimeMillis() / 1000L;
        Human human = new Human("Michael", "Clime", ts);
        System.out.println(human.describeAge());
        System.out.println(human);
    }
}

