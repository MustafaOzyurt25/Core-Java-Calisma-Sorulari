package day17passbyvalue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Denem3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,11,12);
        int arr[] = new int[3];
        
//        list.add(10);
//        list.add(11);
//        list.add(12);
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        System.out.println("list = " + list);
        System.out.println(Arrays.toString(arr));
        
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
        
        changeList(list);
        System.out.println("list = " + list);
        

        
        
        
        
        
        
        
    }

    private static void changeList(List<Integer> lisst) {
        lisst=List.of(3,4,5,6);
        System.out.println("lisst = " + lisst);
    }

    private static void changeArray(int[] arr) {
        arr = new int[5];
        System.out.println(Arrays.toString(arr));
    }


}
