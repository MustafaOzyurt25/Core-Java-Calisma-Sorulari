package day05ifstatement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseStatement {


    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("karakter giriniz");
//        char letter =scanner.next().charAt(0);

        // 1.yol
//        if (letter >= 'A' && letter <='z'){
//            System.out.println("letter  bir harf.. ");
//        }else{
//            System.out.println("letter  bir harf degil.. ");
//        }

        // 2.yol
//        if (Character.isLetter(letter)) {
//            System.out.println("Girilen karakter bir harf.");
//        } else {
//            System.out.println("Girilen karakter bir harf değil.");
//        }


//        Scanner scanner=new Scanner(System.in);

//        System.out.println("yasinizi giriniz");
//        byte yas =scanner.nextByte();
//
//        if (yas < 65) {
//            System.out.println("emekli olamazsin.. .");
//        }else{
//            System.out.println("emekli olabilirsin ....");
//        }

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("ucgenin uc kenar uzunlugunu tam sayi olarak giriniz");
//        int birinciKenar =  scanner.nextInt();
//        int ikinciKenar =   scanner.nextInt();
//        int ucuncuKenar =scanner.nextInt();
//        
//        if (birinciKenar==ikinciKenar && ikinciKenar==ucuncuKenar){
//            System.out.println("eskenardir");
//        }else {
//            System.out.println("eskenar degildir");
//        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin üç kenar uzunluğunu tam sayı olarak giriniz:");

        int birinciKenar = 0;
        int ikinciKenar = 0;
        int ucuncuKenar = 0;

        try {
            System.out.print("Birinci kenar: ");
            birinciKenar = scanner.nextInt();

            System.out.print("İkinci kenar: ");
            ikinciKenar = scanner.nextInt();

            System.out.print("Üçüncü kenar: ");
            ucuncuKenar = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            System.exit(0);
        }

        if (birinciKenar <= 0 || ikinciKenar <= 0 || ucuncuKenar <= 0) {
            System.out.println("Hatalı giriş! Kenar uzunlukları pozitif tam sayı olmalıdır.");
        } else if (birinciKenar == ikinciKenar && ikinciKenar == ucuncuKenar) {
            System.out.println("Girilen kenar uzunlukları ile oluşturulan üçgen eşkenar bir üçgendir.");
        } else {
            System.out.println("Girilen kenar uzunlukları ile oluşturulan üçgen eşkenar bir üçgen değildir.");
        }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       
    }//main
}











