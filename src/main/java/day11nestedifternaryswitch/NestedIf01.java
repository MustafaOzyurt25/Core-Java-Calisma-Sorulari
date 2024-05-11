package day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

        /* Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz */
        
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();

        System.out.println("lutfen yapilacak islemi  (+, -, *, /, %)  giriniz");
        char islem = scanner.next().charAt(0);
        
        if (islem=='+'){
            System.out.println(a +  "+"  +  b  + " = " + (a+b));
        } else if (islem=='-') {
            System.out.println(a +  "-"  +  b  + " = " + (a-b));
        }else if (islem=='*') {
            System.out.println(a +  "*"  +  b  + " = " + (a*b));
        }else if (islem=='/') {
            System.out.println(a +  "/"  +  b  + " = " + (a/b));
        }else if (islem=='%') {
            System.out.println(a +  "%"  +  b  + " = " + (a%b));
        }else {
            System.out.println("lutfen dogru islem karakterini giriniz");
        }
*/
        
        
        // 2. yol 
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz:");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz:");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapılacak işlemi seçiniz (+, -, *, /, %):");
        String islem = scanner.next();

        double sonuc = 0;

        switch (islem) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                break;
            case "%":
                sonuc = sayi1 % sayi2;
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
                
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
