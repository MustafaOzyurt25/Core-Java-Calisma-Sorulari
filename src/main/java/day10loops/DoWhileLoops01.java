package day10loops;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        controlPassword(scanner);
        besyuzeKadarTopla(scanner);

 
        
        
/*
        soru 1 : 7 nin katlari
        int i = 9;
        do {
            if (i%7==0) {
                System.out.println(i);
            }
            i++;
        } while (i < 191);
-----------------------------------------------------------
        char baslH = 'm';
        do {
            System.out.print(baslH + " ");
            if (baslH == 'z') {
                baslH = 'a' - 1; // 'z'den sonra 'a' harfine dönmek için
            }
            baslH++;
        } while (baslH <= 'c' || baslH >= 'm');
        System.out.println();
        // ---------------------------------------------------------
        for (char ch = 'm'; ch != 'd'; ch++) { // 'd' dahil değil
            System.out.print(ch + " ");
            if (ch == 'z') {
                ch = 'a' - 1; // 'z'den sonra 'a' harfine dönmek için
            }
        }
*/
 
        /*
------------------------------- soru 3 : */
     
/*
        int toplam = 0;
        int countP = 0;
        int countN = 0;
        int girilenSayi;
        System.out.println("toplama islemi icin lutfen pozitif tam sayi giriniz...  cikmak icin 0'a basiniz");
        do {
            System.out.println("pozitif tam sayi(" + (countP + 1) + ") : ");
            girilenSayi = scanner.nextInt();
            if (girilenSayi < 0) {
                System.out.println(" negatif sayi giremezsiniz...");
                countN++;

            }
            if (girilenSayi > 0) {
                toplam += girilenSayi;
                countP++;
            }

        } while (girilenSayi != 0);
        System.out.println("Toplam girilen pozitif sayı adedi: " + countP);
        System.out.println("Girilen pozitif sayıların toplamı: " + toplam);
        System.out.println("Yanlışlıkla girilen negatif sayı adedi: " + countN);
*/
/*
           =================================================================     
         Soru 2
                System.out.println("Soru 2: 'm' harfinden 'c' harfine kadar tüm harfler:");
                harfYazdir();
                // Soru 3
                System.out.println("\nSoru 3: Pozitif sayıların toplamını hesaplayın:");
                pozitifSayilarToplami(scanner);
                // Soru 4
                System.out.println("\nSoru 4: Pozitif sayıların toplamını hesaplayın (negatif sayı kabul etmeyin):");
                pozitifSayilarToplamiNegatifOlmadan(scanner);
        */
        scanner.close();
    }

    /*
 Soru 2: 'm' harfinden 'c' harfine kadar tüm harfleri yazdırın
    public static void harfYazdir() {
        for (char ch = 'm'; ch != 'd'; ch++) { // 'd' dahil değil
            System.out.print(ch + " ");
            if (ch == 'z') {
                ch = 'a' - 1; // 'z'den sonra 'a' harfine dönmek için
            }
        }
        System.out.println();
    }
*/

    /*
 Soru 3: Kullanıcıdan pozitif sayılar isteyin, 0 girildiğinde toplam ve sayım
    public static void pozitifSayilarToplami(Scanner scanner) {
        int toplam = 0;
        int sayiAdedi = 0;
        while (true) {
            System.out.print("Pozitif bir sayı girin (Bitirmek için 0): ");
            int sayi = scanner.nextInt();
            if (sayi == 0) {
                break;
            } else if (sayi > 0) {
                toplam += sayi;
                sayiAdedi++;
            }
        }
        System.out.println("Toplam girilen pozitif sayı adedi: " + sayiAdedi);
        System.out.println("Girilen pozitif sayıların toplamı: " + toplam);
    }
*/

    /*
 Soru 4: Kullanıcıdan pozitif sayılar isteyin, negatif girilirse hata verin
    public static void pozitifSayilarToplamiNegatifOlmadan(Scanner scanner) {
        int toplam = 0;
        int sayiAdedi = 0;
        int negatifSayiAdedi = 0;
        while (true) {
            System.out.print("Pozitif bir sayı girin (Bitirmek için 0): ");
            int sayi = scanner.nextInt();
            if (sayi == 0) {
                break;
            } else if (sayi > 0) {
                toplam += sayi;
                sayiAdedi++;
            } else {
                System.out.println("Negatif sayı giremezsiniz");
                negatifSayiAdedi++;
            }
        }
        System.out.println("Toplam girilen pozitif sayı adedi: " + sayiAdedi);
        System.out.println("Girilen pozitif sayıların toplamı: " + toplam);
        System.out.println("Yanlışlıkla girilen negatif sayı adedi: " + negatifSayiAdedi);
    }
*/

    /*
 
    public static void controlPassword(Scanner scanner) {
        while (true) {
            System.out.println("lutfen sifrenizi giriniz...");
            String sifre = scanner.nextLine();
           
            boolean kucukHarfVarmi = sifre.matches(".*[a-z].*");
            boolean buyukHarfVarmi =sifre.matches(".*[A-Z].*") ;
            boolean ozelKarakterVarmi = sifre.matches(".*[^A-z0-9].*");
            boolean karakterYeterliMi = sifre.length() > 7;

            boolean sifreDogruMu = kucukHarfVarmi && buyukHarfVarmi&& ozelKarakterVarmi&&karakterYeterliMi;
            System.out.println(sifreDogruMu);
            if (sifreDogruMu) {
                System.out.println("Sifreniz Kabul edilmistir..");
                break;

            } else if (!kucukHarfVarmi) {
                System.out.println("sifre kucuk harf icermelidr");
            }else if (!buyukHarfVarmi) {
                System.out.println("sifre buyuk harf icermelidr");
            }else if (!ozelKarakterVarmi) {
                System.out.println("sifre ozel  karakter icermelidr");
            }else if (!karakterYeterliMi) {
                System.out.println("sifre en az sekiz karaketer icermelidr");
            }
        }
    }
*/

    private static void besyuzeKadarTopla(Scanner scanner) {
        int toplam = 0;
        int count =0;
        do {
            System.out.println("lutfen  sayi giriniz...");
            int girSayi = scanner.nextInt();
            toplam += girSayi;
            count++;
        } while (toplam < 500);
        System.out.println("toplam : " + toplam + "\ngirilen sayi adedi : " + count );
        
    }


    
}// class


