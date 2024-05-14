package day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12. aya kadar tum aylarin isimlerini yazdiran
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yilin kaçıncı ayinda olduğunuzu giriniz (1-12): ");
        int ayIndeksi = 0;
        try {
            ayIndeksi = scanner.nextInt();
            if (ayIndeksi<1 || ayIndeksi>12){
                System.out.println("llutfen 1-12  arasi sayi giriniz");
                return;
            }
        } catch (Exception e) {
            System.out.println("lutfen 1-12  arasi sayi giriniz");
            return;
        }
        String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        for (int i = ayIndeksi; i < aylar.length+1; i++) {
            System.out.println(aylar[i - 1]);
        }
        
        
/*
        switch (ayIndeksi) {
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Şubat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayis");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Ağustos");
            case 9:
                System.out.println("Eylül");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasım");
            case 12:
                System.out.println("Aralık");
            default:
                System.out.println("lutfen 1-12 arasi bir sayi giriniz");
    }// switch
*/
    }
}
