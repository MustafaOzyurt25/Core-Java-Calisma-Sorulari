package day07stringmanipulation;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodsSorular {
    public static void main(String[] args) {
        // soru 1 :
        String str = "  Java ogrenmek123 Cok guzel@  ";
        System.out.println(str.trim().replaceAll("[0-9]", "").replace("@", "."));// Java ogrenmek Cok guzel.
// veya
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().replaceAll("[ ]+", " ").trim(); //  Java ogrenmek cok guzel.
        str = str.substring(0, 1).toUpperCase() + str.substring(1) + ".";
        System.out.println(str);
        // soru2  
        String str1 = "$13.99";
        String str2 = "$10.55";
        double totalWithout$ = Double.parseDouble(str1.substring(1)) + Double.parseDouble(str2.substring(1));
        String totalWith$ = "$" + totalWithout$;
        System.out.println(totalWith$);
        /*
 soru3
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scanner.nextLine();

        if (isim.contains("a")){
            System.out.println("girdiginiz isim a harfini iceriyor.");
        }

        if (isim.contains("Z")){
            System.out.println("girdiginiz isim Z harfini iceriyor.");
        }
        if (!isim.contains("a") && !isim.contains("Z")){
            System.out.println("girdiginiz isim a veya Z icermiyor");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("lutfen bir soyIsim giriniz");
        String soyIsim = scanner.nextLine();
        
        if (isim.length()>soyIsim.length()){
            System.out.println(isim);
        }else {
            System.out.println(soyIsim);
        }
 */

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir keelime giriniz");
        String keelime = scanner.nextLine();  // alis
        StringBuilder s = new StringBuilder();
        System.out.println(s.length());
        for (int i = keelime.length()-1; i >-1; i--) {
            s.append(keelime.charAt(i));
        }
        System.out.println(s);
*/
        String sifre = "Asd15a";
        char ilkHarf = sifre.charAt(0);
        char sonHarf = sifre.charAt(sifre.length() - 1);
        boolean bosluk = !sifre.contains(" ");
        boolean basariliSifre = Character.isUpperCase(ilkHarf) && Character.isLowerCase(sonHarf) && bosluk && (sifre.length() > 7);
        System.out.println(basariliSifre);
        if (basariliSifre) {
            System.out.println("sifre basarili");
        } else {
            System.out.println("sifre basarisiz .");
        }
        // noktalama
        String s = "Girdg?!igi niz isim, Z harfini ...icer iyor...";
        System.out.println(s.replaceAll("[^\\p{Punct}A-Z]", "*"));  /// TUM NOKTALAMA ISARETLERI HARICI VE BUYUK HARFLER HARICIN DEKI KARAKTERLERI * YAP!
      
      
        // istenilen bicimde isim, soyism, kkartino
        String isim = "mustafa";
        String soyIsim = "Ozyurt";
        String kKardNo = "1234 5689 6987 9698";
       
        String istenenIsimBicimi = isim.trim().substring(0, 1).toUpperCase() + isim.trim().substring(1).replaceAll("[A-z]", "*");
        String istenenSoyIsimBicimi = soyIsim.trim().substring(0, 1).toUpperCase() + soyIsim.trim().substring(1).replaceAll("[A-z]", "*");
        String istenenIsimSoyBic=istenenIsimBicimi + " " + istenenSoyIsimBicimi;
        String gizlenecekKrediKartNo = kKardNo.substring(0, 15).replaceAll("[0-9]", "*");
        String acikKrediKartNo = kKardNo.substring(15);
        String istenenKKardNoBicimi = gizlenecekKrediKartNo + acikKrediKartNo;
      
        System.out.println("isim-soyisim : "+ istenenIsimSoyBic + "\n" + "kart no : "+istenenKKardNoBicimi);

        
    }
}
