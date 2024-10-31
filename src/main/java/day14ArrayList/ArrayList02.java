package day14ArrayList;

import java.util.*;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10
        List<Integer> nearElementList=new ArrayList<>();
        nearElementList.add(12);
        nearElementList.add(23);
        nearElementList.add(10);
        nearElementList.add(19);
        nearElementList.add(18);
        nearElementList.add(17);
        Collections.sort(nearElementList);
      
      
        int sayi1=nearElementList.get(0);
        int sayi2 = nearElementList.get(1);
        int minFark =sayi2-sayi1;
        System.out.println(nearElementList);
        for (int i = 0; i <nearElementList.size()-1 ; i++) {
            if (nearElementList.get(i+1)-nearElementList.get(i)<minFark){
                minFark=nearElementList.get(i+1)-nearElementList.get(i);
             
            }
            
           
        }

        Set<Integer> enyakinSayilar = new HashSet<>();
        for (int i = 0; i <nearElementList.size()-1 ; i++) {
            if (nearElementList.get(i+1)-nearElementList.get(i)==minFark ){
                sayi1=nearElementList.get(i);
                sayi2=nearElementList.get(i+1);
                enyakinSayilar.add(sayi1);
                enyakinSayilar.add(sayi2);
              
            }
           

        }
        System.out.println(" Bu List'te birbirine en yakin tamsayilar : " + enyakinSayilar)  ;
        
        
      
        
        
        
         
        
        
        
        
        
        
    }
}
