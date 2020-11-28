package app;

import java.util.Scanner;

public class homework02 {

    public static void print(String s) {
        System.out.print(s);
    }

    static int random(int min, int max) {
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        return randomNum;
    }

    static String[][] fields(String[][] arr, Object... params) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if( params.length <= 0) {
                    print("\t" + arr[i][j] + "\t" + "|");
                } else {
                    int row = (int) params[0];
                    int clm = (int) params[1];
                    String n = (String) params[2];
                    arr[row][clm] = n;
                    print("\t" + arr[i][j] + "\t" + "|");
                }

            }

            System.out.println();
        }
        ;
        return arr;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target_row = random(1, 5);
        int target_clm = random(1, 5);

        print("Let the game begin! \n");

        String[][] area = {
                {"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"},

        };

        fields(area);

        for (; ; ) {

            print("\n Select column: ");
            int clm = in.nextInt();
            print("\n Select row: ");
            int row = in.nextInt();

            if (clm > area.length - 1 || row > area.length - 1) {
                print("\n You are out of range.Try again.");
            }

            if (row <= area.length - 1 && clm <= area.length - 1) {
                print("\n");
                String[][] g = fields(area, row, clm, "*");
            }
            if (target_row == row && target_clm == clm) {
                String[][] l = fields(area, row, clm, "X");
                print("You win! \n");
                break;
            }

        }

    }

}

