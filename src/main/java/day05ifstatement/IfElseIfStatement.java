package day05ifstatement;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IfElseIfStatement {

    public static void main(String[] args) {
/*
 1. yol girilen gun ile ilgili islemler...
        Scanner scanner = new Scanner(System.in);
        System.out.println("litfen gun ismini giriniz");
        String girilenGunIsmi=scanner.next();
        String firstUpperOtherTwoLower = girilenGunIsmi.substring(0,1).toUpperCase()+girilenGunIsmi.substring(1,3);
        boolean isRight =girilenGunIsmi.equalsIgnoreCase("pazartesi") || girilenGunIsmi.equalsIgnoreCase("sali")|| girilenGunIsmi.equalsIgnoreCase("carsamba")
                || girilenGunIsmi.equalsIgnoreCase("persembe") || girilenGunIsmi.equalsIgnoreCase("cuma") || girilenGunIsmi.equalsIgnoreCase("cumartesi") || girilenGunIsmi.equals("pazar");
        if (isRight){
            System.out.println(firstUpperOtherTwoLower);
        }else {
            System.out.println("gecerli gun ismi giriniz");
        }
 2.yol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz:");
        String girilenGunIsmi = scanner.next().toLowerCase();
        List<String> gunler = Arrays.asList("pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi", "pazar");
        if (gunler.contains(girilenGunIsmi)) {
            String firstUpperOtherTwoLower = girilenGunIsmi.substring(0, 1).toUpperCase() + girilenGunIsmi.substring(1, 3);
            System.out.println(firstUpperOtherTwoLower);
        } else {
            System.out.println("Geçerli bir gün ismi giriniz.");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz:");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
 1.yol
        if (a1 > 0 && a2 > 0) {
            System.out.println("a1+a2 = " + (a1 + a2));
        } else if (a1 < 0 && a2 < 0) {
            System.out.println("a1*a2 = " + a1 * a2);
        } else if (a1 == 0 || a2 == 0) {
            System.out.println("sifr yutandir");
        } else {
            System.out.println(
                    "farkli isaretlerde sayilar..."
            );
        }
        2.yol
        boolean pozitifA1 = a1 > 0;
        boolean pozitifA2 = a2 > 0;
        boolean negatifA1 = a1 < 0;
        boolean negatifA2 = a2 < 0;

        if (pozitifA1 && pozitifA2) {
            System.out.println("Girilen iki pozitif sayının toplamı: " + (a1 + a2));
        } else if (negatifA1 && negatifA2) {
            System.out.println("Girilen iki negatif sayının çarpımı: " + (a1 * a2));
        } else if (a1 == 0 || a2 == 0) {
            System.out.println("Girilen sayılardan en az biri sıfırdır.");
        } else {
            System.out.println("Girilen sayılar farklı işaretlerdedir.");
        }
        
*/

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lütfen notunuzu giriniz:");
        // 1. yol tavsiye edilmez
//        int not = 0;
//        try {
//            not = scanner.nextInt();
//        } catch (Exception e) {
//            System.out.println("tamam");
//        }
//        if (not <50) {
//            System.out.println("D");
//        } else if (not>=50 && not<60) {
//            System.out.println("C");
//        }else if (not>=60 && not<=80) {
//            System.out.println("B");
//        }else {
//            System.out.println("A");
//        }


        // 2. yol tavsiye edilir.
//                if (not < 0 || not > 100) {
//                    System.out.println("Geçersiz not girdiniz! Notunuz 0 ile 100 arasında olmalıdır.");
//                } else if (not < 50) {
//                    System.out.println("Notunuz D.");
//                } else if (not < 60) {
//                    System.out.println("Notunuz C.");
//                } else if (not <= 80) {
//                    System.out.println("Notunuz B.");
//                } else {
//                    System.out.println("Notunuz A.");
//                }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen teklifinizi giriniz:");
        double teklif = scanner.nextDouble();

        if (teklif>80000) {
            System.out.println("ok kabul.");
        } else if (teklif>=60000) {
            System.out.println("konusalim");
        }else {
            System.out.println("maalesef kabul edemem");
        }


    }
        
            



    }

