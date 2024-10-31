package day10loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
       /*
 soru 1 : 
        int i = 3;
        while (i < 14) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
*/
/*
        int i = 100;
        while (i < 1000) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.println(i);
            }
            i++;
        }
*/
        for (int i = 100; i < 1000; i++) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.println(i);
            }
        }
        // soru 4
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("lutfen baslangic degerini giriniz");
//        int basl =scanner.nextInt();
//
//        System.out.println("lutfen bitis degerini giriniz");
//        int bitis =scanner.nextInt();
//
//
//        int  i=basl;
//        while(  i <  bitis+1){
//         if (i%2==0){
//             System.out.print(i +" ");
//         }
//         i++;
//        }
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("lutfen baslangic harfini giriniz");
//        char baslH =scanner.next().charAt(0);
//
//        System.out.println("lutfen bitis harfini giriniz");
//        char bitisH =scanner.next().charAt(0);
//
//
//        char  i=baslH;
//        while(  i <  bitisH+1){
//            System.out.print(Character.toUpperCase(i));
//            i++;
//        }
        // soru 5 : 
//        int num= 3;
//        int i =1;
//        while (i < 11) {
//            System.out.print(num + "x"+i + "=" + (num*i)+" ");
//            i++;
//        }
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("lutfen bir sayi giriniz");
//        int sayi =scanner.nextInt();  // 123
       
/*
        int  i=2;  
        int count=0;
        while(  i <  sayi){
         if (sayi%i==0){
             System.out.print(i +" ");
             count++;
         }
         i++;
        }
        System.out.println();
        System.out.println(sayi +" saysisini bolen toplam " + count + " sayi mevcuttur");
*/
        // soru 7
//        int basmTopl=0;
//      
//        while ( sayi >0 ){
//             basmTopl +=sayi%10;
//           
//            sayi /=10;
//        }
//        System.out.println(basmTopl);
        //--------------------------------------
        Scanner scanner = new Scanner(System.in);
        // Soru 5
        System.out.print("Bir rakam giriniz: ");
        int rakam = scanner.nextInt();
        carpimTablosu(rakam);
        // Soru 6
        System.out.print("\nBir sayı giriniz: ");
        int sayi = scanner.nextInt();
        tamBolenler(sayi);
        // Soru 7
        System.out.print("\nBir sayı daha giriniz: ");
        int sayi2 = scanner.nextInt();
        rakamlarToplami(sayi2);
        scanner.close();
    }

    // Soru 5: Çarpım Tablosu
    public static void carpimTablosu(int rakam) {
        System.out.println(rakam + " sayısının çarpım tablosu:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(rakam + " x " + i + " = " + (rakam * i));
        }
    }

    // Soru 6: Tam Bölenler
    public static void tamBolenler(int sayi) {
        System.out.println(sayi + " sayısının tam bölenleri:");
        int count = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nToplam tam bölen sayısı: " + count);
    }

    // Soru 7: Rakamlar Toplamı
    public static void rakamlarToplami(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Rakamlar toplamı: " + toplam);


    }

}// class
