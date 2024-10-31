package day12tekrar;

import java.util.Arrays;

public class StrMnp03 {
    public static void main(String[] args) {
        //Ex : bir Stringin hic katrakter icerip icermedigini konrol eden kodu yaziniz.
        String s = " h";
        System.out.println("s.isBlank() = " + s.isBlank());
        // Bir Strinde a,i,e karakterlerinin ilk gorunumunun indexleri toplammini ekrana yazdirini
        String st = "Java is easy to learn";
        int ilkGorToplam = st.lastIndexOf("") + st.indexOf('e') + st.indexOf("i");
        System.out.println("ilkGorToplam = " + ilkGorToplam);  // 34
        // INTERWIEW QUESTIONS USA QA
        String str = "abbccdihuc";   //tkrarsiz karakterleri ekrana yaz;
        String[] sttr = str.split("");
        String uniqueCha = "";
        for (String w : sttr) {
            if (str.indexOf(w) == str.lastIndexOf(w)) {
                uniqueCha = uniqueCha + w;
            }
        }
        System.out.println("uniqueCha = " + uniqueCha);
        // sayi uc basamakli ise ekrana "verilen data uc basamaklidir"
        // yazdiran kodu yaziniz
        int number1 = -1900;
        int number=Math.abs(number1);
        if (number<1000 && number>99){
            System.out.println(number1 + "  3 basamaklidir");
        }
        
        
        
        
        


    }
}
