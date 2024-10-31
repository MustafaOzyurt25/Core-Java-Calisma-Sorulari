package day14ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Donusum {
    public static void main(String[] args) {
        

        String arr[] = {"Tavsan", "Bungal"};
        List<String> list1 =Arrays.asList(arr);

        System.out.println(list1);
        System.out.println(Arrays.toString(arr));
        
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(Arrays.toString(arr));
     
       list1.set(1,"At");
        System.out.println(list1);
        System.out.println(Arrays.toString(arr));
        arr[0]="Tazi";
        
        System.out.println(list1);
        System.out.println(Arrays.toString(arr));
//        list1.add("55");  uygulamaz..

        ArrayList<Integer>  myArrayList = new ArrayList<>();
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(10);
        myArrayList.add(100);
        myArrayList.add(101);
      
        Object[] myArray =myArrayList.toArray();       // 5 elementli array olustu.
    
        
        myArrayList.add(105);
        
        
        myArray[myArray.length-1]=800;
        System.out.println(myArrayList);
        System.out.println(Arrays.toString(myArray));
        
//        Integer[] w =new Integer[7];
        Integer[] arr1 =myArrayList.toArray(new Integer[7]);
       
        arr1[7] = 999;
        System.out.println(Arrays.toString(arr1));
        
        
//        Object[] array =myArrayList.toArray();
//        myArrayList.add(102);
//        System.out.println(myArrayList);
//        array[0]=7;
////        array[5]=17;
//        System.out.println(Arrays.toString(array));
        
        
        
        
        
    }
}
