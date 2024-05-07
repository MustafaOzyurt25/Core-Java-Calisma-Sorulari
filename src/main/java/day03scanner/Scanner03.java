package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan adresini aliniz ve ekrana yazdiriniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen adresinizi giriniz");
        String adres=scanner.nextLine();
        System.out.println("adresiniz = " + adres);

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        System.out.println("lutfen iki  sayi  giriniz");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        double toplama = sayi1+sayi2;
        System.out.println("toplama = " + toplama);
        double cikarma = sayi1-sayi2;
        System.out.println("cikarma = " + cikarma);
        double carpma = sayi1*sayi2;
        System.out.println("carpma = " + carpma);
        double bolme = sayi1/sayi2;
        System.out.println("bolme = " + bolme);


        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        //i) Alanini hesaplayiniz ==> Kisa kenar * Uzun Kenar
        //ii) Cevresini hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

        System.out.println("dikdörtgenin birinci kenar uzunlugunu giriniz");
        double birinciKenar=scanner.nextDouble();
        System.out.println("dikdörtgenin ikinci kenar uzunlugunu giriniz");
        double ikinciKenar=scanner.nextDouble();
        double alan = birinciKenar*ikinciKenar;
        double cevre = 2*(birinciKenar+ikinciKenar);

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
        
        
        
        
                
        
        
        
        
    }
}
