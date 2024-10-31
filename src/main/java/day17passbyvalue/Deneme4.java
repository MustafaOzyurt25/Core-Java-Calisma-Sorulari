package day17passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class Deneme4 {
    public static void main(String[] args) {
        String str = "Mehmet";
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str = " + str);
        List<String> list = new ArrayList<>();
        System.out.println("list = " + list);
        list.add("Ayse");
        System.out.println("list = " + list);
        System.out.println("list.get(0).toUpperCase() = " + list.get(0).toUpperCase());
        System.out.println("list = " + list);

        String st = new String("mehmet");
        for (int i = 0; i < 100; i++) {
            st += i +" . deger";
            System.out.println("st = " + st);
        }
        System.out.println("st = " + st);
        
        
    }
   
    
    
}
