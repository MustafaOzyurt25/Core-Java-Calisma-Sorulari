package day13arrayandscope;

import java.util.Scanner;

public class Nestedloop {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j < 8; j++) {
                System.out.println("  Day: " + j);
            }

        }
//          2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
//                        ****
//                        ****
//                        ****
//        Note: Get the number of the rows and the columns from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen Rectangle Star Pattern icin satir sayisini giriniz");
        int row = scanner.nextInt();
        System.out.println("lutfen Rectangle Star Pattern icin sutun sayisini giriniz");
        int column = scanner.nextInt();
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < column + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*
        3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
*/
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
