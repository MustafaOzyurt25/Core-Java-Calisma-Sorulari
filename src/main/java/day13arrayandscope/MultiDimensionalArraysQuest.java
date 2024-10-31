package day13arrayandscope;

import java.util.Arrays;

public class MultiDimensionalArraysQuest {
    public static void main(String[] args) {
        //  soru 1 :
        String[] stdNames = {"ayse", "cansu", "ahmet", "mehmet", "mustafa"};
        System.out.println("Array hashcode: " + Arrays.hashCode(stdNames));
        System.out.println("Array toString: " + Arrays.toString(stdNames));
        System.out.println(stdNames[1].hashCode());
        for (int i = 0; i < stdNames.length; i++) {
            System.out.println("Element " + i + " hashcode: " + (stdNames[i] != null ? stdNames[i].hashCode() : "null"));
        }
        String[] nums = {"1", "21", "3"};
        System.out.println("Array hashcode: " + Arrays.hashCode(nums));
        System.out.println("Array toString: " + Arrays.toString(nums));
        System.out.println(nums[1].hashCode());
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element " + i + " hashcode: " + (nums[i] != null ? nums[i].hashCode() : "null"));
        }
        System.out.println(Arrays.toString(nums));
        for (String w : stdNames) {
            System.out.print(w + " , ");
        }
        // Ex 2: bir integer Array olusturun. 5 eleman ekleyiniz. elemenlarin toplamini bulup konsola yazdiriniz
        int[] say = new int[5];
        say[0] = 1;
        say[1] = 2;
        say[2] = 3;
        say[3] = 4;
        say[4] = 5;
        int[] sayilar = {1, 2, 3, 4, 5};
        int toplam = 0;
        for (int a : sayilar
        ) {
            toplam += a;
        }
        System.out.println(toplam);
        // Ex 3: bir char Array olusturun. 3 eleman ekleyiniuz. elemenlarin carpimini bulup konsola yazdiriniz
        char[] letters = {'1', '2', '3'};
        int carpim = 1;
        for (char c : letters
        ) {
            carpim *= c;
        }
        System.out.println(carpim);
        int[] grades = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));  // [67, 98, 100, 34, 76]
        //   Ex: grades arrayindaki en buyuk ve en kucuk grade in toplmaini bulunuz
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
        int toplamMinAndMax = grades[0] + grades[grades.length - 1];
        System.out.println(toplamMinAndMax);
        // Ex: size verilen bir String Array deki isimlerden 5 karakterdendn az karakter icerenleri consola yazdirini
        for (String w : stdNames
        ) {
            if (w.length() < 5) {
                System.out.println(w);
            }
            
        }

        // Ex: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
        // isimlerden onceki isimleri consola yazdiriniz
        
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));
        for (String w:stdNames
             ) {
            if (w.startsWith("m")){
                break;
            }
            System.out.println(w);
        }
       

    }


}
