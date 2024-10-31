package day13arrayandscope;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        // 1 YOL
        String names [] = {"K","C","R","A","S","K"};
        String el ="R";
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.binarySearch(names, el));
/*
        
        for (String w: names) {
            
            if (w.equals(el)){
                System.out.println("names disizisinde, "+el +" kelimesi vardir ");
                break;
            }else {
                System.out.println("names disizisinde, "+el +" kelimesi yoktur ");
                break;
            }
        }
*/
        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        
        String sSadeceHarfler =s.replaceAll("[^A-z]","");
        String[] srr =sSadeceHarfler.split("");
        
        System.out.println(Arrays.toString(srr)); // [Java, is, easy., Learn, Java, earn, money.]
        System.out.println(srr.length);


    }
}
