package day14ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSunumQuests {
    public static void main(String[] args) {
        ArrayList<String> arList1 = new ArrayList<>();
        arList1.add("A");
        arList1.add("C");
        arList1.add("E");
        arList1.add("F");
        arList1.add("B");
        arList1.add(1,"L");
        arList1.set(arList1.indexOf("E"),"D");
        arList1.remove("F");
        Collections.sort(arList1);
        
        if (arList1.contains("L")&&!arList1.contains("M")){
            System.out.println("L listtte var ama M yok.."); 
        }
        
        arList1.clear();
        System.out.println(arList1.isEmpty());
        System.out.println(arList1.size());
        System.out.println(arList1);
        
        
        
        
        
        
        
        
        
    }
}
