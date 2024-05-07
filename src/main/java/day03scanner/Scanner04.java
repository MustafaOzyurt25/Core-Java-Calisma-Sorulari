package day03scanner;

import java.util.Scanner;

public class Scanner04 {


    //Kullanicidan alacagınız 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
    //rakamlarin toplamini yazidiran kodu yaziniz.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz..");
        int sayi = scanner.nextInt();
  // 1.yol ( tavsiye edilmez)
//        int ilkBasamak =sayi%10;
//        int  dortBasamakliSayi = sayi / 10;
//
//        int ikincibasamak = dortBasamakliSayi%10;
//        int ucBasmakliSayi = dortBasamakliSayi/10;
//
//        int ucuncubasamak = ucBasmakliSayi%10;
//        int ikiBasmakliSayi  = ucBasmakliSayi/10;
//
//
//        int dorduncuBasmak = ikiBasmakliSayi%10;
//        int sonSayi  = ikiBasmakliSayi/10;
//
//        System.out.println("rakamlar toplami : " + (sonSayi + dorduncuBasmak + ilkBasamak+ikincibasamak));

        // ikinci yol 
        int kutu = 0; //78540
        int istenenToplam = 0;
        for (int i = 5; i > 0; i--) {
            kutu = sayi % 10;
            sayi = sayi / 10;
            if (i != 3) {
                istenenToplam = kutu + istenenToplam;
            }
        }
        System.out.println("istenenToplam : " + istenenToplam);


    }
}
    

