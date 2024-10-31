package day13arrayandscope;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
        //Multidimensional array nasil olusturulur?
        int[][] marr = new int[2][3]; //         {{1,2,3},{4,5,6}}
        //MultiDimensional Arraylere eleman nasil eklenir?
        marr[0][0] = 1;
        marr[0][1] = 2;
        marr[0][2] = 3;
        marr[1][0] = 4;
        marr[1][1] = 5;
        marr[1][2] = 6;
        //MultiDimensional Arrayleri console yazdirmak icin deepToString() methodunu kullaniriz
        System.out.println(Arrays.deepToString(marr));   // [[1, 2, 3], [4, 5, 6]]
        for (int i = 0; i < marr.length; i++) {
            for (int j = 0; j < marr[i].length; j++) {
                System.out.println(marr[i][j]);
            }
        }
        //MultiDimensional Array icinden specific bir elemani nasil yazdirilir ( 5 )
        System.out.println(marr[1][1]);
        //MultiDimensional Array icindeki array nasil yazdirilir
        System.out.println(Arrays.toString(marr[1]));  // [4, 5, 6]
        //Kisa yoldan Multidimensional array nasil olusturulur
        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan", "tg"}};
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int toplam = 0;
        for (String[] w : students
        ) {
            toplam += w.length;
        }
        System.out.println(toplam);
        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        int counter = 0;
        for (String[] w : students
        ) {
            for (String s : w
            ) {
                if (s.contains("m")) {
                    counter++;
                    System.out.println(s);
                }
            }
        }
        System.out.println("m' li isimlerin sayisi = " + counter);
        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        
        int[][]  myArray ={{1,5,6,7},{3,4,7,8},{9,8,5}};
       
//        int[][]  yArray = new int[3][4];
        
        int carpimsonucu = 1;
        for (int[] w :myArray
             ) {
            for (int n:w
                 ) {
                carpimsonucu *=n;
            }
        }
        System.out.println(carpimsonucu);
        
        
    }
}
