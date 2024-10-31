package day14ArrayList;


import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
        String[] starr = new String[5];
        System.out.println(Arrays.toString(starr));
        List<String> listOfStars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfStars.add(i, "*");
            listOfStars.add(i + 1, "ayce");
            System.out.println(listOfStars.size());
        }
        listOfStars.add("hamza");
       
        listOfStars.add(0,"hasan");
        List<String> listOfCties = new ArrayList<>();
        listOfCties.add("erz");
        listOfCties.add("izmir");
        listOfStars.addAll(listOfStars.size()-1,listOfCties);
        List<String> listOfMyNumbers = new ArrayList<>(listOfStars);
       listOfMyNumbers.add("armut");
        System.out.println(listOfStars);
        System.out.println(listOfMyNumbers);
        System.out.println("listOfStars.size() = " + listOfStars.size());
        System.out.println("listOfCties.size() = " + listOfCties.size());
        System.out.println("listOfMyNumbers.size() = " + listOfMyNumbers.size());
        System.out.println("listOfMyNumbers.get(listOfMyNumbers.size()-1) = " + listOfMyNumbers.get(listOfMyNumbers.size()-1));
        System.out.println(listOfMyNumbers.get(listOfMyNumbers.size()-1));
        listOfMyNumbers.set(listOfMyNumbers.size()-1, "elma");
        System.out.println("listOfMyNumbers.get(listOfMyNumbers.size()-1) = " + listOfMyNumbers.get(listOfMyNumbers.size()-1));
        System.out.println(listOfMyNumbers.contains("elma"));
        
        ArrayList<Integer> myIntegerList = new ArrayList<>();
        ArrayList<Integer> myIntegerList2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myIntegerList.add(i);
        }
        System.out.println(myIntegerList);
        System.out.println("myIntegerList2.isEmpty() = " + myIntegerList2.isEmpty());
        System.out.println("myIntegerList.isEmpty() = " + myIntegerList.isEmpty());
        
        myIntegerList.clear();
        System.out.println("myIntegerList = " + myIntegerList);
        myIntegerList2.clear();
        
       if ( myIntegerList2.size()==0){
           System.out.println("myIntegerList2 bos");
       }else {
           System.out.println("myIntegerList2 dolu");
       }
        System.out.println("listOfStars.equals(listOfMyNumbers) = " + listOfStars.equals(listOfMyNumbers));

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ufuk");
        names1.add("ali");

        ArrayList<String> names2 = new ArrayList<>();
        
        names2.add("fatih");
        names2.add("ufuk");
        names2.add("ali");
        names2.add("usame");

        boolean s =names1.equals(names2);
        System.out.println("names1 = " + names1);
        System.out.println("names2 = " + names2);
        System.out.println(s);

        //verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz
        
        ArrayList<String> l1=new ArrayList<>();
        Collection<Integer> l2=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            l1.add(String.valueOf(i));
        }

        for (int i = 9; i >-1 ; i--) {
            l2.add(i);
        }
        System.out.println("l2.equals(l1) = " + l2.equals(l1));
//        Collections.sort(l2);
        Collections.sort(l1);
        System.out.println("l2.equals(l1) = " + l2.equals(l1));
        System.out.println("l2.remove(5) = " + l2.remove(5));
        System.out.println("l2.remove(5) = " + l2.remove(5));
        
        names1.remove("klj");
        l1.remove(5);
        System.out.println("names1.remove(u) = " + names1.remove("u"));
        System.out.println("names1.remove(1) = " + names1.remove(1));
        
        //Example 1: Bir Integer list olusturun ve 12 elemanini siliniz.
        //Arraylist olustururken sag tarafa (constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa ister Arraylist yazin ister List yazin ikiside calisir
        //Detaylari Collections konusunda gorecegiz

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
            
            
        }
        System.out.println(list);
        
        for (int i = 0; i < 11; i++) {
            if (list.size()>3 ){
                System.out.println("list.remove(i) = " + list.remove(i));   i--;
            }

          
         
            
        }
        
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
        System.out.println(ages.remove(ages.indexOf(12) ));
        System.out.println(ages);

        //Kisa yoldan bir list olusturmak icin List.of() methodunun kullanabiliriz
        //List.of methodu degistirilemez bir liste olusturmak icin kullanilir
        //bu method ile olusturulan list degistirmeye yonelik methodlari desteklemez
        List<String> noChangeList = List.of("Ahmet","Mehmet","Can");
        List<String> noChangeList2 = new ArrayList<>();
      noChangeList2.add(null);
      System.out.println(noChangeList2.get(0));
        
      List<Character> listOfChr= List.of('a','b','a','c','d','a');
        System.out.println(listOfChr);
        System.out.println(listOfChr.lastIndexOf('a'));
        System.out.println(ages.lastIndexOf(15));

        //Example 2: Bir listteki tekrarsiz elemanlari console a yazdiriniz
        
        // 1. way once sort kullan  sonra loop.
     
        
        
        // 2. way String bir list olustur tekrar etmeyenleri al.
        
        List<Character> listOfInMuatable = new ArrayList<>();
        for (Character w:listOfChr
             ) {
            if (!listOfInMuatable.contains(w)){
               listOfInMuatable.add(w);
            }
        }
        System.out.println(listOfInMuatable);
        for (Character w:listOfChr
             ) {
            if (listOfChr.indexOf(w)==listOfChr.lastIndexOf(w)){
                System.out.print(w + " ");
            }
        }

        //Example 3: Bir list te tekrarli eleman olup olmadigini gosteren kodu yaziniz..
        System.out.println();
        if (listOfChr.size()==listOfInMuatable.size()){
            System.out.println("listede tekrar eden element yok");
        }else {
            System.out.println("listede tekrar eden element var");
        }
        
        

        
        
        
        

    }
}
