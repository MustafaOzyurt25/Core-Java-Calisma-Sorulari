package day12tekrar;

public class StrMnp01 {
    public static void main(String[] args) {

         String a = "Benim Tek Rakibim Dunku Ben. ";
        System.out.println(a.substring(10, 17));
        System.out.println(a.indexOf("Rakibim"));
        System.out.println(a.contains("bim"));

        // ilk 6 karakteri at sonrasi Tek kelimesiyle baslar mi
        System.out.println(a.substring(6).startsWith("Tek"));
        System.out.println(a.startsWith("Tek", 6));
        
        //    Javada farkli data type'lari arasinda islem yapiliyorsa sonuc buyuk
        //         olan data type' in turunde olur.
        //        - Karsilastirma operatorlerinde sonuc hep boolean doner
        System.out.println((4 * (5 + 2 / 7)));
        System.out.println((4.5 * (5 + 2 / 7)));

        boolean first = 2<4;     // t
        System.out.println(first);

        // 'A' karakterinin Ascii degerini hesaplatan kodu yaziniz
        
        int  asciiOfA = 'A';
        
        System.out.println(asciiOfA);

        int asciia = 'a';
        System.out.println("asciia = " + asciia);  // asciia = 97

        char adIlkHarf = 'a';
        System.out.println("adIlkHarf  = " + adIlkHarf ); //  adIlkHarf  = a
        
        int asciiCurly ='}';
        System.out.println(asciiCurly);
        
        byte ascii9 ='9';
        System.out.println(ascii9);
        System.out.println('9');

        String str1 = "java";
        char ch3 = 'G';
        int sp = 5;
        System.out.println(ch3 + sp + str1);  //  90java

        int sayiInt = 100;
        long sayiLong = 100L;
        System.out.println("sayiInt == sayiLong : " +( sayiInt == sayiLong));


    }
    
    
}
