package app.homework_5.main;

import java.util.Arrays;

public class homework_5 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][1];

        for (DayOfTheWeek day : DayOfTheWeek.values()) {
            Arrays.fill(schedule[day.ordinal()], day.getTitle());
        }


        Human human = new Human("Michael", "Velychkevych", 1991, 100, schedule);
        System.out.println(human);
    }
}

