package day14ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
           /*
1) AYNI DATA TIPINDEKI COKLU DATAYI DEPOLAMAK IICN ARRAY KULLANIRIZ
2)ICINE KOYACAGIMIZ ELEMAN SAYISINI ONCEDEN BELIRTMEK ZORUNDA KALMAMIZ ARRAYLARIN NEGATIF YANIDIR.
3) Iste  bu esneklik probleminden dolayi java array list olusturmus,
      hic eleman koymazsak eleman sayisini 0 olarak ayarlar. 1000 eleman koyarsak eleman sayisini1000 olarak ayarlar
4) "Array list" yerine sadece "list" de diyebiliriz.
5) Cava ARRAYLIST LERI OLUSTURDUKTDAN SONRA Arrayleri SILMEDI. NEDEN?
    1 - ARRAYLAR SUPER HIZLIDIR 2-ARRAYLAR MEMORYDE COOOK AZ YER KAPLAR

6)ARRAYLAR "PRIMITIVE DATA" TYPELARI VE "REFERANCE" LARI DEPOLAYABILIR AMA
ARRAYLIST' LER NON-PRIMITIVE DATA TYPELARINI DEPOLARLAR. BU YUZDEN ARRAYLISTLER ARRAYLAR DEN DAHA COK YER KAPLARLAR
ve buyuk data type icerdiklerinden daha yavaslar
     */
        ArrayList<Integer> ages = new ArrayList<>(); //
        // ARRAYLIST' E ELEMAN NASIL EKLENIR
// 1. way
        ages.add(12);
        ages.add(24);
        ages.add(9); //add metodu elemanlari giris sirasina (insertion order) gore liste yerlestirir. bknz  : [12, 24, 9]
        ages.add(1, 99);
        List<Integer> price = new ArrayList<>(ages);
       price.add(888);
        
        ages.addAll(1,price);
      
        System.out.println("ages.contains(9) = " + ages.contains(9));
        System.out.println("ages.get(ages.get) = " + ages.get(ages.indexOf(12)));
        ages.set(0, 11);
       
        
        ages.clear();
        System.out.println(ages);
        
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Erzurum");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barselona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println("cities = " + cities);

        cities.remove("Miami");
        cities.remove(cities.lastIndexOf("Miami"));
        System.out.println("cities = " + cities);
        System.out.println("cities.remove(3) = " + cities.remove(3));

        List<Integer> yas = new ArrayList<>();

        // 12 elemanini List ten sil:
        yas.add(23);
        yas.add(12);
        yas.add(7);
        yas.add(4);
        yas.add(23);
        yas.add(23);
        System.out.println("yas.remove(ages.indexOf(12)) = " + yas.remove(yas.indexOf(12)));
        System.out.println("yas = " + yas);
        // Bir Arrylisteki bir elemanin tum gorunumlarini nasil silriz
        for (Integer w:yas
             ) {
            if (w.equals((Integer) 23)){
                System.out.println("evet varlar!!!");
            }
        }

        // Removing all occurrences of the element 23 using an iterator
//        Iterator<Integer> iterator = yas.iterator();    
//        while (iterator.hasNext()) {    // yas = [23, 7, 4, 23, 23]
//            Integer element = iterator.next();
//            if (element.equals(23)) {
//                iterator.remove();
//            }
//        }
//        System.out.println("yas = " + yas);
        
        Predicate<Integer> isEqual23 = n->n.equals(23);
        
        yas.removeIf(isEqual23);
        System.out.println("yas = " + yas);

    
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Çift sayıları kaldırmak için Predicate oluşturma
        Predicate<Integer> isEven = number  -> number % 2 == 0;

        // removeIf metodunu kullanarak çift sayıları kaldırma
//        boolean removed = numbers.removeIf(isEven);
numbers.removeIf(number  -> number % 2 == 0);
        // Sonuçları yazdırma
//        System.out.println("Elemanlar kaldırıldı mı? " + removed);
        System.out.println("Kalan elemanlar: " + numbers);
        
        
        

    }
}
