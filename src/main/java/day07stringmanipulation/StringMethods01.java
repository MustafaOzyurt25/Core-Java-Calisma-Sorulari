package day07stringmanipulation;

import java.util.Locale;

public class StringMethods01 {
    public static void main(String[] args) {
        // concatenation
        String isim = "Ali";
        String soyIsim = "Can";
        String fullName = isim + " " + soyIsim;  // + ile concatenation
        System.out.println("fullName = " + fullName);  // Ali Can
        System.out.println("isim.concat(soyIsim) = " + isim.concat(soyIsim));   // concat() ile concatenation
        // charAt()
//        System.out.println("fullName.charAt(4) = " + fullName.charAt(13));
        // toLowerCase~toUpperCase
        String isim1 = "TECHPROEDUCATION".toLowerCase();
        System.out.println("isim1 = " + isim1); // techproeducation
        System.out.println(isim1.toUpperCase(Locale.forLanguageTag("tr")));  // TECHPROEDUCATİON
        System.out.println(isim1.toUpperCase(Locale.forLanguageTag("en")));  // TECHPROEDUCATION
        // 5- equals  ~  ==  
        String sA = "Haluk Bilgin";
        String sB = sA + "" ; // Haluk Bilgin
        System.out.println("sA.equals(sB) = " + sA.equals(sB));
        System.out.println(sA==sB);// false
        // == Stringlerin hem degerlerine hem de adreslerine bakar
        // bu ornekte sA+"" yazdigimizda concatenation yapildigi icin Java yeni bir obje
        // olusturur ve islemin sonucunu yeni obje'nin icine koyar.
        // sA ve sB 'yi == ile karsilastirirsak degerleri ayni fakat adresleri farkli oldugu icin
        // false doner

        String ism1="Ali Can";
        String ism2=ism1+"";
        System.out.println("(ism1==ism2) = " + (ism1 == ism2));
        System.out.println("ism2.equals(ism1) = " + ism2.equals(ism1));
/*
        Bellek
                +----------------------------------------------+
                |               name2 = null                    | <- name2, bir null referansı işaret ediyor ( yani bellekte herhangi bir nesneye işaret etmez )
                |                                              |
               +----------------------------------------------+

                Bellek
                +----------------------------------------------+
                |               name1 = ""                      | <- name1 boş bir String ifadesine sahip. (yani bellekte bir nesne oluşturulmuş ve içeriği hiçbir karakter içermez)
                |                                                |
              +----------------------------------------------+
      
      ---------------------------------------------------------------------------------------------------------------------------------
      
              
                                      Araba araba1 = new Araba("Toyota", 2020);
                                      
                                                Stack Bellek         
                        +----------------------------------------------+
                        |                araba1 (referans)             | <- araba1 stack bellekte saklanıyor
                        +----------------------------------------------+
                        
                        
                                           Heap Bellek
                        +----------------------------------------------+
                        |                Araba nesnesi                  | <- Araba nesnesi heap bellekte saklanıyor
                        |                    +-------------------------+ |
                        |                    | marka = "Toyota"       | |
                        |                    | yil = 2020             | |
                        |                    +-------------------------+ |
                        |                                              |
                        +----------------------------------------------+
      
*/
        // 8- indexOf()
        String isim2 = "TECHPROEDUCATION";
        System.out.println("isim2 = " + isim2);  // TECHPROEDUCATION
        System.out.println("isim2.indexOf(\"E\") = " + isim2.indexOf("E", 2)); // 1
       
    /*
       ornek :
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cumle gir : ");
        String cumle = scanner.nextLine();
        System.out.println("bir kelime gir : ");
        String kelime = scanner.next();
        int indexOfKelime = cumle.indexOf(kelime);
        System.out.println("indexOfKelime = " + indexOfKelime);
        int lastIndexOfKelime = cumle.lastIndexOf(kelime,21);
        System.out.println("lastIndexOfKelime = " + lastIndexOfKelime);
        
        if (indexOfKelime== -1){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if(indexOfKelime == lastIndexOfKelime){
            System.out.println("girilen kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }
*/
        String cumle = "java cak kolay, ama java buyuk  ilgi bekler.";
        System.out.println("cumle.lastIndexOf(\"a\") = " + cumle.lastIndexOf("a",20));
        
        // 10 -contains()
        System.out.println("cumle.contains(\"ava\") = " + cumle.contains("java cak kolay,"));
        
       boolean buyukIceriyorMu= cumle.contains("buyuk");
       boolean kucukIceriyorMu= cumle.contains("kucuk");
       
       if (buyukIceriyorMu){
           System.out.println(cumle.toUpperCase());
       } else if (kucukIceriyorMu) {
           System.out.println(cumle.toLowerCase(Locale.forLanguageTag("tr")));
       }else {
           System.out.println("Cumle buyuk yada kucuk kelimelerini iceermiyor ");
       }
       
       //  kullanicidan email isteyin, mail @gmail.com icermiyorsa, "@gmail.com icermiyor", @gmail.com ile bitiyorsa "mailiniz kaydedildi", @gmail.com ile bitmiyorsa "@gmail.com ile bitmiyor" yazdirin
    
        String email = "@gmail.comozyurdu2560";
       if (!email.contains("@gmail.com")){
           System.out.println("emailiniz @gmail.com icermiyor");
       } else if (email.endsWith("@gmail.com")) {
           System.out.println("emailiniz kaydedildi");
       } else {
           System.out.println("lutfen yazimi kontrol ediniz");
       }
       
//       String str =null;
        //  System.out.println("str.isEmpty() = " + str.isBlank());    Cannot invoke "String.isEmpty()" because "str" is null
    
        // 14-replace()
        String str1 ="java da java . calisirsan cok kolaydir java";
        System.out.println("str1.replace(\"a\",\"e\") = " + str1.replace("a", "!"));
        System.out.println(str1);
        System.out.println("str1.replace('a', '?') = " + str1.replace('a', '?'));
        System.out.println("str1.replace(\"m\", \"n\") = " + str1.replace("java", "mmmm"));

        // 14-replaceAll()
        
        


      

        
    }


}
