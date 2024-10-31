package day10loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 1.sayiyi giriniz");
        int girilenSayi1 = scanner.nextInt();
        if (girilenSayi1<0){
            System.out.println("lutfen 0 veya uzeri tamsayi giriniz");
        }else {
            System.out.println(faktoriyelAl(girilenSayi1));
        }
//        System.out.println("lutfen 2.sayiyi giriniz");
//        int girilenSayi2 = scanner.nextInt();
//        System.out.println(topla(girilenSayi1, girilenSayi2));
       
//        if (  isPallingrum(kelime)){
//            System.out.println( kelime + " kelimesi pallingrumdur" );
//        }else {
//            System.out.println( kelime + " kelimesi pallingrum degildir" );
//        }
//        System.out.println(tersineCevir(kelime));
        
/*
        // soru 1 : Java guzeldir.
        for (int i = 1; i < 11; i++) {
            System.out.println("Java guzeldir. " + (i));
        }
        // soru 2 : 
        for (int i = 10; i < 31; i++) {
            if (i < 30) {
                System.out.print(i + " , ");
            } else {
                System.out.println(i);
            }

        }
        // soru 2 : 
        for (int i = 100; i > 49; i--) {
            if (i > 50) {
                System.out.print(i + " , ");
            } else {
                System.out.println(i);
            }

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        int girilenSayi = scanner.nextInt();
        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print( " Java Guzeldir ,");
            } else if ( i% 5 == 0) {
                System.out.print( " Guzeldir ,");
            } else if (i % 3 == 0) {
                System.out.print( " Java ,");
            }else {
                System.out.print(i+" , ");            }


        }
        
*/
     
        /*
         1 .yol substring ve conc  ile
         2.yol
                String kutu = "";
                for (int i = kelime.length() - 1; i > -1; i--) {
                    kutu = kutu + kelime.charAt(i);
                }
                System.out.println(kutu);
        */
    }// main

/*
    private static String tersineCevir(String kelime) {
        String kutu = "";
        for (int i = kelime.length() - 1; i > -1; i--) {
            kutu = kutu + kelime.charAt(i);
        }
        return kutu;
    }
*/

/*
    public static boolean isPallindrome(String word){  // Kazak
        String kutu = "";
        for (int i = word.length() - 1; i > -1; i--) {
            kutu = kutu + word.charAt(i);
        }
        if (word.equalsIgnoreCase(kutu)){
            return true;
        }
        return false;
    }
*/

    public static int topla(long sayi1, long sayi2) {
        int toplam = 0;
        if (sayi1 < sayi2) {
            for (long i = sayi1; i < sayi2 + 1; i++) {
                toplam += i;
            }
            return toplam;
        } else {
            for (long i = sayi2; i < sayi1 + 1; i++) {
                toplam += i;
            }
            return toplam;
        }

    }

    
//    public static int faktoriyelAl(int sayi) {
//        int carpim = 1;
//        for (int i = 1; i < sayi + 1; i++) {
//            carpim = carpim * i;
//        }
//        return carpim;
//    }
    


    public static BigInteger faktoriyelAl(long sayi) {
        BigInteger carpim = BigInteger.ONE;
        for (int i = 1; i <= sayi; i++) {
            carpim = carpim.multiply(BigInteger.valueOf(i));
        }
        return carpim;
    }



}// class
