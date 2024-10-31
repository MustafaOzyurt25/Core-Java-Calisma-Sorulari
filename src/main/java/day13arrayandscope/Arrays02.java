package day13arrayandscope;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6,5,7,3};
      
        System.out.println(Arrays.toString(arr));
        int toplam = 0;
        for (int w : arr ) {
            toplam += w;
        }
        System.out.println("toplam = " + toplam);
        Arrays.toString(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 5, 6, 7]
        int brr[] =new int[arr.length] ;
       
        for (int i =arr.length-1; i >-1 ; i--) {
            brr[arr.length-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(brr)); // [7, 6, 5, 3, 2, 1]
        Arrays.sort(brr);
        System.out.println(Arrays.binarySearch(brr, 8));


        int[] dizi = {1,10,2, 20,80, 30, 40, 50,70}; // Çift sayıda elemanlı dizi
        int aranan = 25;
            Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi)); // [1, 2, 10, 20, 30, 40, 50, 70, 80]
        int indis = Arrays.binarySearch(dizi, aranan);
        System.out.println(indis);

       int []  numbers ={1, 2,6, 7};
       Arrays.sort(numbers); // 1,2,6,7
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 9));
        
        String[] letters ={"A","N","F","C"};
        Arrays.sort(letters);// A C F N
        
        System.out.println(Arrays.binarySearch(letters, "E"));
        System.out.println(Arrays.equals(numbers, new int[]{1, 2,6, 7}));
        
        int[] arr1 ={2,1,7,6};
        int[] arr2 ={7,1,6 ,2};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr2, arr1));
        
        String s ="java ogrenmek, IT alaninda yer edinmek demek";
        String[] srr=s.split(""); // {"m","e","r",}
        System.out.println(srr.length);
//        Arrays.sort(srr);
        System.out.println(Arrays.toString(srr));

        int random[] ={5,6,-4,12,0,-10};
        int x =12;
//        Arrays.sort(random);
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        int mrr[][] = new int[3][2];

        int[][] mr ={{1,2},{3,2},{45,2},{10,32}};

        mr[0][0]=5;
        
        System.out.println(Arrays.deepToString(mr));
        System.out.println(mr[2][1]);
        for (int i = 0; i < mr.length; i++) {
            for (int j = 0; j < mr[i].length; j++) {
                System.out.println(mr[i][j]);
            }
            
        }
      
        
        
    }// 
}
