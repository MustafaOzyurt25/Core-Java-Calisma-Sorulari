package day05ifstatement;

import java.util.Scanner;

public class NestedTernary01 {
    
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tam,sayi giriniz");
        int sayi =scanner.nextInt();
        String s = sayi < 10 ? "Rakam" : ((sayi < 100) ? ("iki basamakli sayi") : ("uc basamakli sayi veya daha buyuk sayi"));
        System.out.println(s);
       Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf  =scanner.next().charAt(0);
*/

/*
 1 .yol
      String str = harf>='a' &&harf <'z' ? "kucuk harf" : ( harf>='A' &&harf <'Z' ? "buyuk harf" : ("Girduginiz karakter harf degil"));
      System.out.println(str);
 2. YOL
        String str = Character.isLowerCase(harf)   ? "kucuk harf" : (Character.isUpperCase(harf)  ? "buyuk harf" : ("Girduginiz karakter harf degil"));
        System.out.println(str);
 3. YOL
        if (Character.isLowerCase(harf)) {
            System.out.println("KH");
        } else if (Character.isUpperCase(harf)) {
            System.out.println("BH");
        } else {
            System.out.println("Girdiğiniz karakter harf değil.");
        }
*/
        int y = 5;
        int sonuc = (y > 5) ? (y < 10 ? 2 * y : 3 * y) : ((y > 10) ? 2 + y : 3 + y);
        System.out.println("sonuc = " + sonuc);
        
        
        
        
        
        
        
        


    }
}
