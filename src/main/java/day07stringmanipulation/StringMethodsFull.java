package day07stringmanipulation;

public class StringMethodsFull {
    public static void main(String[] args) {

      
                    /*
                      
         G harfinin indexi
         H harfinin indexi
        od nin indexi        
        int index = text.indexOf("o"); // int değişkene atanabilir. küçük o harfi
        System.out.println("index = " + index); // 1 :  aynı karakterden birden fazla var ise ilkini verir.
        
      
        
    
        */
        String text = "Good";
        System.out.println(text.indexOf('h'));
        System.out.println("----------");
        String cicek = "Gunebakan5";
        System.out.println(cicek.lastIndexOf("5"));
        String textt = "halukbilgin";
        System.out.println(textt.indexOf("i"));

        /*
         * charAt()
         * İstenen noktadaki karakteri verir,
         * karakterlerin sırası 0 dan başlar, buna index denir.
         * Metin icerisinde, istenilen indexteki karaktere ulasimi saglar. Sonuc char dir.
         *  0123456789012
         */
        String sehir = "istanbul";
        System.out.println(sehir.charAt(7));
        /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
         */
        String ss = "Her ders Java gibi olsa";
        System.out.println(ss.substring(10));
//        System.out.println(ss.length());
        // son10 karakteri alma
        System.out.println(ss.substring(ss.length() - 10));
        // ilk 10 karakteri alma
        System.out.println(ss.substring(0, 11));
        // 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        System.out.println(ss.substring(11));
        System.out.println(ss.substring(10, 11));
        System.out.println(ss.length());  // 23
        System.out.println(ss.substring(ss.length() - 1)); //a: length()-1 -> son karakter
        System.out.println("--->" + ss.substring(ss.length())); //bosluk ...length() -> bos    // System.out.println("--->" +"");
        //System.out.println(str.substring(24)); // length()'den buyuk sayi yazarsak RTE
        // ss'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin
        String ilkOn = ss.substring(0, 10);
        System.out.println(ilkOn);
        String artaKalan = ss.substring(11);
        String duzenlenenSs = ilkOn.replaceAll("[A-z ]", "*") + artaKalan;
        System.out.println(duzenlenenSs);  // **********va gibi olsa
        System.out.println(ss.replaceAll("[\\w ]", "*") + ss.substring(10));// ***********************ava gibi olsa
        
        /*trim()
         Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar, aralardaki bosluklara dokunmaz. Sonuc String dir.
         */
        String city = "     istanbul    ";
        System.out.println("trim kullanilmadan once >>>>>>" + city + "<<<<<"); //      istanbul
        System.out.println("trim kullanildiktan sonra >>>>>>" + city.trim() + "<<<<<"); //      istanbul
        System.out.println("----------");

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String'dir..
         *
         */
        String ozellik = "hayalperest";
        System.out.println("a harfini @ isarti ile degistir >>> " + ozellik.replace("al","@"));

        /*ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */

        String txt = "Merhaba Dunya";
        System.out.println(txt.replace('a', '#'));
        System.out.println(txt.replaceFirst("a", "#"));
        
        /*
        replaceAll()
        
         */

        String numara = "$18,0! 0? Milyon...";
        System.out.println(numara.replaceAll("[$\\p{Punct}]", "%")); //  %18%0% 0% Milyon%%%
        System.out.println(numara.replaceAll("[^$\\p{Punct}]", "%")); //  %18%0% 0% Milyon%%%

        /**
         * contains()
         * Metin icerisinde arama yapmamizi saglar.
         * bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
         * Sonuc boolean dir.
    
         * equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */

        String str = "Merhaba";
        String st = "Merhaba";
        System.out.println(st.equals(str));
        System.out.println(str.startsWith("M"));


        /**
         * StringConcat
         * bir stringe diğerini ekler
         * Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
         * her ikisi String ise Java toplama degil BIRLESTIRME yapar
         * */

        System.out.println(st.concat(" Dunya "));// Merhaba Dunya 
        System.out.println(st + " "+ "Dunya");// Merhaba Dunya 

        /**Equals() methodu ve Cift Esittir (==) Farki
         */

        String sA = "Haluk Bilgin";
        String sB =sA+"";
        System.out.println(sA.equals(sB));
        System.out.println(sB == sA);
        
        String sC= sA;
        System.out.println(sC == sA);


        String cumle = "Bu gün hava yagmurlu";
        System.out.println(cumle.length()); // 20

        String s3=null; // null hic demek
        // normalde String'ler "" icine yazilir ama null icin buna gerek yoktur
        // null case sensitive'dir , dolayisiyla NULL veya Null yazilmaz
        // null bir deger degildir, sadece hicligi gosteren bir pointer'dir
        System.out.println(s3.length());

        
        

    }// main


}
