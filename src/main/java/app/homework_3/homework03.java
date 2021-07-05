package app.homework_3;

import java.util.Scanner;

public class homework03 {

    public static void print(String s) {
        System.out.println(s);
    }

    public static String[][] generateCalendar() {
        String[][] calendar = new String[7][2];
        calendar[0][0] = "Sunday";
        calendar[0][1] = "do home work";
        calendar[1][0] = "Monday";
        calendar[1][1] = "go to courses; watch a film";
        calendar[2][0] = "Tuesday";
        calendar[2][1] = "learn java";
        calendar[3][0] = "Wednesday";
        calendar[3][1] = "learn TypeScript";
        calendar[4][0] = "Thursday";
        calendar[4][1] = "go for a walk";
        calendar[5][0] = "Friday";
        calendar[5][1] = "visit cinema";
        calendar[6][0] = "Saturday";
        calendar[5][1] = "chill";
        return calendar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] calendar = generateCalendar();

        for (; ; ) {
            print("Please, input the day of the week: ");
            String selectedDay = in.nextLine();
            switch (selectedDay.toLowerCase().trim()) {
                case "sunday": {
                    print("Your tasks for " + selectedDay + ": " + calendar[0][1]);
                    break;
                }
                case "monday": {
                    print("Your tasks for " + selectedDay + ": " + calendar[1][1]);
                    break;
                }
                case "tuesday": {
                    print("Your tasks for " + selectedDay + ": " + calendar[2][1]);
                    break;
                }
                case "wednesday": {
                    print("Your tasks for " + selectedDay + ": " + calendar[3][1]);
                    break;
                }
                case "thursday": {
                    print("Your tasks for " + selectedDay + ": " + calendar[4][1]);
                    break;
                }
                case "friday": {
                    print("Your tasks for " + selectedDay + ": " + calendar[5][1]);
                    break;
                }
                case "saturday": {
                    print("Your tasks for " + selectedDay + ": " + calendar[6][1]);
                    break;
                }
                case "exit": {
                    return;
                }
                default:
                    print("Sorry, I don't understand you, please try again");
            }
        }
    }

}
