package day13arrayandscope;

import java.util.Arrays;

public class MD02 {
    public static void main(String[] args) {
        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2},{5,9,7,8,2}}; // ==> { 5, 4, 2, 3, 2 }
        int numOfElements = 0;
        for (int[] w : numbers) {
            numOfElements += w.length;
        }
        int[] yeniArray = new int[numOfElements];
        int i = 0;
        for (int[] w : numbers) {
            for (int k : w) {
                yeniArray[i] = k;
                i++;
            }
        }
        System.out.println(Arrays.toString(yeniArray));


        int nu[][][] = new int[2][3][4];  // {  {{1,2,3,4},{1,2,3,4},{1,2,3,4}},{{1,2,3,4},{1,2,3,4},{1,2,3,4}}   }
                                                   // [ [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]] ]     
       
        nu[0][0][3]=5;
        nu[1][0][0]=5;
        nu[1][2][3]=5;
        System.out.println(Arrays.deepToString(nu));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int ages[][] = { {15, 4}, {12, 43,96, 21} }; // ==> 4 + 43 = 47
        
        int min =ages[0][0];
        int max = ages[0][0];
        for (int w[]:ages
             ) {
            for (int a:w
                 ) {
              min = Math.min(a,min);
              max=Math.max(max,a);
            }
        }
        System.out.println("max : " +max + " ,min : "+ min);
        System.out.println("toplam : " + (max+min));
        
        
        
        
        
        
    }


}

