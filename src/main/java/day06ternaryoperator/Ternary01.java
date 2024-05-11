package day06ternaryoperator;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        
        // (condition) ? expression1 : expression2
        
        // s1
        int y=1;
/*
//        String str =y>5 ? "inek": "koyun";
        System.out.println(y>5 ? "inek": "koyun");

        System.out.println((y<91)? 9 : 11);
        
        int z =1;
        int a = y<10 ? y++ : z++;
        System.out.println(y + "," + z+"," + a);
        // ------------------------------------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        
     int kucukSayi = Math.min(sayi1, sayi2);
//        int kucukSayi = (sayi1<sayi2) ? (sayi1) : (sayi2);
        System.out.println(kucukSayi);

//        System.out.println((kucukSayi%2==0) ? "kucukSayi , cift sayidir" : "kucukSayi , tek sayidir");
        System.out.println(Math.abs(kucukSayi));
        int mutlakDeger=kucukSayi<0 ? -kucukSayi : kucukSayi;
        System.out.println(kucukSayi<0 ? -kucukSayi : kucukSayi);

//        Object sonuc= kucukSayi<0 ? kucukSayi*kucukSayi: "sayi pozitif";

        System.out.println( kucukSayi<0 ? Math.pow(kucukSayi,2): "sayi pozitif");
*/

/*
                                Scanner scanner = new Scanner(System.in);
        System.out.println("dikdortgenin birinci kenar uzunlugunu giriniz...");
        int birinciKenar = scanner.nextInt();

        System.out.println("dikdortgenin ikinci kenar uzunlugunu giriniz...");
        int ikinciKenar = scanner.nextInt();
        if (ikinciKenar==birinciKenar){
            System.out.println("KARE");
        }else {
            System.out.println("KARE DEGIL");
        }
        System.out.println((ikinciKenar == birinciKenar) ? ("Kare") : ("Kare Degil..."));
*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen  bir sayi giriniz...");
       
        int sayi = scanner.nextInt();
      String str =  (sayi< 0) ? ((sayi> -1000 &&  sayi<-99 )?("uc basamakli"):("uc basamakli degil")): ((sayi>99 && sayi<1000) ? ("uc basamakli"):("uc basamakli degil"));
        System.out.println("str = " + str);
       
        
        
        
        
        
    }//main
}
