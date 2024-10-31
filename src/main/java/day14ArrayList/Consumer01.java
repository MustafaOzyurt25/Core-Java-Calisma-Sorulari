package day14ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Consumer01 {
    public static void main(String[] args) {
        // Bir ArrayList oluştur ve bazı elemanlar ekle
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // Bir iterator al
        Iterator<Integer> iterator = arrayList.iterator();

        // İlk elemanı işle ve iteratörü bir ileri taşı
        if (iterator.hasNext()) {
            System.out.println("First element: " + iterator.next());
        }

        // Kalan elemanlar için belirtilen işlemi uygula
        Consumer<Integer> action = (Integer i) -> {
            System.out.println("Processing element: " + i);
        };
        if (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        iterator.forEachRemaining(action);

    }
}
