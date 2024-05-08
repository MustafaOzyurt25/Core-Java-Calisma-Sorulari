package day04wrapper;

import java.util.Scanner;

public class Operatorler {
    public static void main(String[] args) {
        
        int numA = 2;
        numA +=5;
        numA++;
        int numB = 10;
        System.out.println(numB--);
       
        numB *=7;// 63
        numB -=3;
        numB /=6;
        
        System.out.println("numB = " + numB);
        System.out.println("numA = " + numA);
        
        int a = 15%4;
        int b = a++;
        System.out.println("b = " + b); // 15
        System.out.println("a = " + a); // 16

        System.out.println(38/2*(4+3)*2);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 4 basamakli bir sayi giriniz"); 
        int number=scanner.nextInt();// 4568
        
        int basamakToplam =0;
        for (int i = 4; i >0 ; i--) {
            basamakToplam += number%10;
            number /=10;
            
        }
        System.out.println("basamakToplam = " + basamakToplam);
        
        
        
        
    }
}
