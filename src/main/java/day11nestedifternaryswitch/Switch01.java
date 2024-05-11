package day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen haftanın kaçıncı gününde olduğunuzu giriniz (1-7): ");
        int gunIndeksi = scanner.nextInt();
        String sonuc = "";
        switch (gunIndeksi) {
            case 1:
                sonuc = "pazar";
                break;
            case 2:
                sonuc = "pazartesi";
                break;
            case 3:
                sonuc = "sali";
                break;
            case 4:
                sonuc = "carsamba";
                break;
            case 5:
                sonuc = "persembe";
                break;
            case 6:
                sonuc = "cuma";
                break;
            case 7:
                sonuc = "c.tesi";
                break;
            default:
                sonuc = "lutfen gecerli gun sayisini giriniz...";
        }
   System.out.println("haftanin " + gunIndeksi + "." + "gunu : " + sonuc);
  
        // 2. yol
        Scanner scanner = new Scanner(System.in);
        int gunIndeksi;
        do {
            System.out.print("Lütfen haftanın kaçıncı gününde olduğunuzu giriniz (1-7): ");
            gunIndeksi = scanner.nextInt();
        } while (gunIndeksi < 1 || gunIndeksi > 7);
        // Haftanın gününü isme dönüştürelim
        String[] gunler = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
        String gunAdi = gunler[gunIndeksi - 1];
        // Sonucu yazdıralım
        System.out.println("Girdiğiniz gün, " + gunAdi + " günüdür.");
 */
  
/*
        Scanner scanner = new Scanner(System.in);
        int ayIndeksi =0;

        do {
            System.out.print("Lütfen yilin kaçıncı ayinda olduğunuzu giriniz (1-12): ");
             try {
            ayIndeksi = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("lutfen 1-12 arasi sayi giriniz");
          return;
        }
        } while (ayIndeksi < 1 || ayIndeksi > 12);
        // 
        String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        String ayAdi = aylar[ayIndeksi - 1];
        // Sonucu yazdıralım
        System.out.println("Girdiğiniz ay, " + ayAdi + " ayidir.");
*/

  /*  
  System.out.print("Lütfen yilin kaçıncı ayinda olduğunuzu giriniz (1-12): ");
      

        try {
            ayIndeksi = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("lutfen 1-12 arasi sayi giriniz");
            return;
        }
        String sonuc = "";
        switch (ayIndeksi) {
            case 1:
                sonuc = "Ocak";
                break;
            case 2:
                sonuc = "Şubat";
                break;
            case 3:
                sonuc = "Mart";
                break;
            case 4:
                sonuc = "Nisan";
                break;
            case 5:
                sonuc = "Mayıs";
                break;
            case 6:
                sonuc = "Haziran";
                break;
            case 7:
                sonuc = "Temmuz";
                break;
            case 8:
                sonuc = "Ağustos";
                break;
            case 9:
                sonuc = "Eylül";
                break;
            case 10:
                sonuc = "Ekim";
                break;
            case 11:
                sonuc = "Kasım";
                break;
            case 12:
                sonuc = "Aralık";
                break;
            default:
                sonuc = "lutfen 1-12 arasi bir sayi giriniz";


        }// switch
        // Sonucu yazdıralım
        System.out.println("Girdiğiniz ay: " + sonuc);
*/

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi =scanner.nextInt();
        String sonuc = "";
        switch (sayi){
            case 10 : sonuc ="iki basamakli en kucuk sayi";
            break;
            case 100 : sonuc ="3 basamakli en kucuk sayi";
                break;
            case 1000 : sonuc ="4 basamakli en kucuk sayi";
                break;
            default:sonuc ="girdigin sayiyi degistir";
        }
        System.out.println(sonuc);
*/

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen SDET kisaltmasindaki harflerden birini giriniz :");
        char harf = ' ';
        try {
            harf = scanner.next().toUpperCase().charAt(0);
        } catch (Exception e) {
            System.out.println("harf girmelisin..");
        }
        String sonuc = "";
        switch (harf){
            case 'S' : sonuc ="Software";
            break;
            case 'D' : sonuc ="Dev";
                break;
            case 'E' : sonuc ="Engineer";
                break;
            case 'T': sonuc ="In Testing";
                break;
            default:sonuc ="girdigin harfi degistir";
        }
        System.out.println(sonuc);
*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz :");
        String gunIsmi = scanner.next().toLowerCase();
        String sonuc = "";
        switch (gunIsmi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                sonuc = "hafta ici";
                break;
            case "cumartesi":
            case "pazar":
                sonuc = "hafta sonu";
                break;
            default:
                sonuc = "lutfen gun ismini duzgun giriniz...";


        }
        System.out.println(sonuc);
*/
        // 2.yol
        // Kullanıcıdan gün adını alalım
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir gün adı giriniz: ");
        String gunAdi = scanner.nextLine().toLowerCase(); // Küçük harfe dönüştürüyoruz
        // Hafta içi ve hafta sonu günlerini içeren bir dizi oluşturalım
        String[] haftaIciGunler = {"pazartesi", "salı", "çarşamba", "perşembe", "cuma"};
        String[] haftaSonuGunler = {"cumartesi", "pazar"};
        // Kullanıcının girdiği günün hafta içi veya hafta sonu olup olmadığını kontrol edelim
        boolean haftaIciMi = false;
        boolean haftaSonuMu = false;
        for (String gun : haftaIciGunler) {
            if (gun.equals(gunAdi)) {
                haftaIciMi = true;
                break;
            }
        }
        for (String gun : haftaSonuGunler) {
            if (gun.equals(gunAdi)) {
                haftaSonuMu = true;
                break;
            }
        }
        // Sonucu yazdıralım
        if (haftaIciMi) {
            System.out.println(gunAdi + " hafta içi bir gündür.");
        } else if (haftaSonuMu) {
            System.out.println(gunAdi + " hafta sonu bir gündür.");
        } else {
            System.out.println("Geçersiz gün adı girdiniz.");
        }


    }
}
