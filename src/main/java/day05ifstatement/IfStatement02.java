package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("bir tam sayi giriniz");
//        int sayi=scanner.nextInt();
//        if (sayi %2 ==0) {
//            System.out.println("girilen sayi cift");
//        }else{
//            System.out.println("girilen sayi tek");
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("gun isimlerinden birinin ilk harfini giriniz..");
//        String ilkHarf = scanner.next().toUpperCase().substring(0,1);
//
//        if (ilkHarf.equals("P")) {
//            System.out.println("Pazar,P.tesi veya Persembe");
//        } else if (ilkHarf.equals("S")) {
//            System.out.println("Sali");
//        } else if (ilkHarf.equals("C")) {
//            System.out.println("Carsamba,Cuma,C.tesi");
//        } else {
//            System.out.println("olmadi, dogru harfi girin");
//        }

//                Scanner scanner = new Scanner(System.in);
//        System.out.println("gun isimlerinden birini giriniz..");
//        String girilenGunIsmi = scanner.next().toUpperCase();
//
//                if (girilenGunIsmi.equals("CUMARTESI") || girilenGunIsmi.equals("PAZAR") ) {
//            System.out.println("HAFTASONU");
//        } else {
//                    System.out.println("HAFTA ICI"); // burda kullanicinin girisleri kontrol edilmemis
//                }


//                        Scanner scanner = new Scanner(System.in);
//        System.out.println("dikdortgenin birinci kenar uzunlugunu giriniz...");
//        int birinciKenar = scanner.nextInt();
//
//        System.out.println("dikdortgenin ikinci kenar uzunlugunu giriniz...");
//        int ikinciKenar = scanner.nextInt();
//        
//        if (ikinciKenar==birinciKenar){
//            System.out.println("KARE");
//        }else {
//            System.out.println("KARE DEGIL");
//        }

                        Scanner scanner = new Scanner(System.in);
        System.out.println("gun isimlerinden birini giriniz..");
        String girilenGunIsmi = scanner.next().toUpperCase();
                if (girilenGunIsmi.equals("CUMA")  ) {
            System.out.println("Muslaman icin kutsal  gun");
        }

        if (girilenGunIsmi.equals("CUMARTESI")  ) {
            System.out.println("Yahu icin kutsal  gun");
        }
        if (girilenGunIsmi.equals("PAZAR")  ) {
            System.out.println("HRIST icin kutsal  gun");
        }
        
        
        
        
                
                
                
        
        
        
        
        
        
    }//main


}
