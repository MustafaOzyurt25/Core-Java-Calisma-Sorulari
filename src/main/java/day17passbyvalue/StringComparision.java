package day17passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class StringComparision {
    public static void main(String[] args) {
        // new String() ile oluşturulan String'ler
        String str1 = new String("mehmet");
        String str2 = new String("mehmet");
        System.out.println("new == " + (str1 == str2)); // Referansları karşılaştırır, false döner
        System.out.println("new equals " + str1.equals(str2)); // İçeriği karşılaştırır, true döner
        // String literal'leri
        String str3 = "mehmet";
        String str4 = "mehmet";
        System.out.println("klasik == " + (str3 == str4)); // Referansları karşılaştırır, true döner
        System.out.println("klasik equals " + str3.equals(str4)); // İçeriği karşılaştırır, true döner
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
//        list.add(7);
        for (String s : list) System.out.print(s);
        System.out.println();

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);     // Satır 4
        values.add(5);     // Satır 5
        values.set(1, 6);  // Satır 6
        values.remove(0);  // Satır 7
        for (Integer v : values) System.out.print(v); // Satır 8
    }
}




