package day05ifstatement;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
        
/*
        Scanner scanner  = new Scanner(System.in);
        System.out.println("sifrenizi giriniz");
        String sifre =scanner.next();
        char ilkHarf =sifre.charAt(0);
       
        if(ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("gecerli sifre");
            }else {
                System.out.println("gecersiz sifre");
            }
        }else {
            if (ilkHarf == 'z') {
                System.out.println("gecerli sifre");
            }else {
                System.out.println("gecersiz sifre2");
            }
            
            
        }
        
*/
        /*
2.yol
        Scanner scanner = new Scanner(System.in);

        System.out.println("Şifrenizi giriniz:");
        String sifre = scanner.next();

        if (isGecerliSifre(sifre)) {
            System.out.println("Güvenli şifre.");
        } else {
            System.out.println("Güvensiz şifre.");
        }
    }

    public static boolean isGecerliSifre(String sifre) {
        char ilkHarf = sifre.charAt(0);
        if ((ilkHarf == 'A') || ilkHarf == 'z') {
            return true;
        } else {
            return false;
        }
*/

/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("4 basamakli sayi giriniz:");
        int sayi = scanner.nextInt();
        if (sayi>9999 || sayi<1000){
            System.out.println("sayi 4 basamakli degil");
        }else {
            if (sayi %5==0) {
                if (sayi %10==0) {
                    System.out.println("5 e bolunen cift sayi");
                }else {
                    System.out.println("5 e bolunen tek sayi");
                }
            }else {
                System.out.println("tekrar deneyin. 5 ' e bolunmuyor sayiniz!");
            }
        }
*/

/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dört basamaklı bir sayı giriniz:");
        int sayi = scanner.nextInt();

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Girilen sayı dört basamaklı değil. Lütfen tekrar deneyin!");
            return;
        }

        if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("Girilen sayı 5'e bölünebilen çift bir sayıdır.");
            } else {
                System.out.println("Girilen sayı 5'e bölünebilen tek bir sayıdır.");
            }
        } else {
            System.out.println("Girilen sayı 5'e bölünemiyor. Lütfen tekrar deneyin!");
        }
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yil bilgisini giriniz");
        short yil = scanner.nextShort();
        /*
-------------------------- 1.yol 
        if (yil %4==0) {
            if (yil%100!=0){
                System.out.println("artik yil...");
            }else {
               if (yil%400==0){
                   System.out.println("artik yil..");
               }else {
                   System.out.println("artik yil degil");
               }
            }
        }else {
            System.out.println("artik yil degil");
        }

*/
        //  2.yol----------------------
        if (isArtikYil(yil)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }

    // Bir yılın artık yıl olup olmadığını kontrol eden metod
    public static boolean isArtikYil(int yil) {
        if (yil % 4 == 0) {
            return yil % 100 != 0 || yil % 400 == 0;
        }
        return false;
    }


}



