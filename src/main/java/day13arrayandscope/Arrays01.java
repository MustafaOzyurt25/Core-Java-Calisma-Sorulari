package day13arrayandscope;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String s = " ";
        int a = 5;
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr1));
       int bas = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
//                System.out.print(" , arr1[ " + (i) + " ] " + " = " + arr1[0]);
                arr1[i] = bas;
                
            } else {
//                System.out.print(" , arr1[ " + (i) + " ] " + " = " + arr1[i + 1]);
                arr1[i] = arr1[i+1];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        
        byte[] brr;
        long[] crr = new long[3];
        System.out.println(Arrays.toString(crr));
        String[] str = {"Ali", "Veli", "Arzu"};
        str[0] = "Ahmet";
        str[1] = "Ahmet";
        str[2] = "Ahme";
        System.out.println(Arrays.toString(str));
        System.out.println(str[2]);
        System.out.println(str.length);//3
        System.out.println(str[0].length());//5


    }
}
