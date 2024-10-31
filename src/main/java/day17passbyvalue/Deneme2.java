package day17passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class Deneme2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("list = " + list); // []
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println("list = " + list);   //  10 11 12 
       
        degistirSet(list);
        
        
//        degistir(list);

        System.out.println("list = " + list);  //  13 14 15

    }


    private static void degistirSet(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 3);
            System.out.print(list.get(i) + " ");  // 13 14 15 
        }
        System.out.println();
        System.out.println("listdegistirSet = " + list);    // 13 14 15
    }


//    private static void degistir(List<Integer> list) {
//        for (Integer w : list) {
//            w +=3;
//            System.out.print(w +" ");
//        }
//        System.out.println();
//        System.out.println("listdegistir = " + list);  //  // list = [10, 11, 12] my excpaction
//
//    }


}
