package day14ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList04 {
    public static void main(String[] args) {
        // Bir Arrylisteki bir elemanin tum gorunumlarini nasil silriz
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(15);
        numbers.add(10);
        
//        numbers.removeIf(n->n==10);
        List<Integer> kaldirList = new ArrayList<>();
        kaldirList.add(10);
        System.out.println(numbers);
        numbers.removeAll(kaldirList);
        System.out.println("kalan elemanlafr : "+ numbers);

        //        Ex > bir list teki tekrarsiz elemanlari consola yazdiran kodu yaziniz
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
       
        int counter = 0;
        for (Double w :prices
             ) {
            if (prices.indexOf(w)!=prices.lastIndexOf(w)){
               counter++;
               
            }
        }
        System.out.println(counter/2 + " tane tekrar eden element var bu listte");
        
        
        
    }
}
