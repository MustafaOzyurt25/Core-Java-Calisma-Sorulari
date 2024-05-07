package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scanner.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim=scanner.nextLine();
        System.out.println(isim + " "+soyIsim);
        
        
        
        
        
    }// main
}// class
