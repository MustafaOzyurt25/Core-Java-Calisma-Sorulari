package day10loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz..");
        int sayi =scanner.nextInt();
        
        for (int i =1; i <sayi+1; i++) {
            for (int j = 1; j <sayi+1 ; j++) {
                System.out.print(i * j +"  ");
            }
            System.out.println();
        }
        
     
        for (int i =1; i <sayi+1 ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
    }
}
