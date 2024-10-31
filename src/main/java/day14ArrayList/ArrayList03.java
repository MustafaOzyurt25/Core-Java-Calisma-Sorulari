package day14ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        
           /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin,
        yok ise o harfi list'e ekleyin
    */
        Scanner scanner = new Scanner(System.in);
        List<String> myCharList = new ArrayList<>();
        do {
            System.out.println("lutfen bir harf giriniz");
            String ch = scanner.next();
            if (ch.equalsIgnoreCase("q")) {
                System.out.println("tekrar bekleriz");
                break;
            }
            if (myCharList.contains(ch)) {
                myCharList.add("Buldum");
            } else {
                myCharList.add(ch);
            }


        } while (true);
        System.out.println(myCharList);


    }
}
