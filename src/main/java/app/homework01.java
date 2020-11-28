package app;

import java.util.Scanner;


public class homework01 {

    public static void print(String s) {
        System.out.print(s);
    }

    static int random(int min, int max) {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        return randomNum;
    }

    static void checkResult(int userNumber, int randomNumber, String name) {
        if (userNumber > randomNumber) {
            print("Your number is too big. Please, try again. \n");
        } else if (userNumber < randomNumber) {
            print("Your number is too small. Please, try again.\n");
        } else if (userNumber == randomNumber) {
            System.out.printf("Congratulations %s !", name);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("STARTING GAME \n");
        print("Input your name: \n");
        String name = in.nextLine();
        System.out.printf("Your name: %s \n", name);
        for (; ; ) {

            print("Input your number: ");
            int num = in.nextInt();
            int r = random(0, 100);
            System.out.printf("Random number is : %d \n", r);

            checkResult(num, r, name);

            if (num == r) {
                break;
            }

        }
    }


}
