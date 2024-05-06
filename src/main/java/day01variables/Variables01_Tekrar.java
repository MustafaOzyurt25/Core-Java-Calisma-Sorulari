package day01variables;

public class Variables01_Tekrar {

//        int age1 = 15;

    public static void main(String[] args) {
        
        
/*  Variable olusturma
data type + variable name + atama operatoru +data + noktali virgyl
            int age = 15;
 */

        int age = 15;
        
         /*
            Java da temelde iki tip data vardir.
            1)primitive data type:
                char, boolean, byte, short, int, long, float, double
            2)non-primitive data type:
                String
        */

        //Ornek 1: Ogrenci ismi icin variable olusuturup deger olarak Ali Can atayiniz
        String studentName = "Ali Can";
        System.out.println("StudentName = " + studentName);

        //Ornek 2 : char data type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        char firstLetter = 'A';
        char digit ='1';
        char cynbol ='%';

        //Ornek 3: boolean data type'inda emeklimisin icin bir variable olusturun ve false degerini atayin
        boolean isRetired = false;
        System.out.println("isRetired    = " + isRetired + "\n" + "firstLetter = " + firstLetter + "\n" + "studentName = " + studentName);

        //Ornek 4 : byte data type'inda ogrenci yasi icin bir variable  olusturunuz ve deger atayiniz.
        byte studentAge = 15; // -128 ile 127 arasindaki degerler byte tipinden variablelara atanabilir.
        System.out.println("Atudent's Age = " + studentAge);

        //Ornek 5 : Site nufusu icin bir variable olusturun ve deger atayiniz
        short countyPopulation = 15000;
        short koyNufusu;
        koyNufusu = 10088;


        //Ornek 6: Ulke nufusu icin bir variable olusturun ve deger atamasi yapiniz
        int countryPopulation = 968545412;


        //Ornek 7: insan vücudundaki hucre sayisi icin variable olusturup deger atamasi yapin
        long cellNumber = 90000454500000L;

        // ----------------------------------------------------------------
        //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz
        float shirtPrice = 11.1F;  // 4 byte
        float shouesPrice = 12.13F;
        System.out.println("totalPrice = " + (shouesPrice + shirtPrice));
        int a = 5;
        System.out.println("a = " + a);

        //Ornek 9: Hucre agirligi ve Amipin agirligi icin iki tane varibale olusturunuz 
        // ve agirliklari farkini console a yazidiriniz   // 8 byte

        double weightOfAmip = 0.000000000000000000000000090;
        double weightOfCell = 0.000000000000000000000000005;

        System.out.println("fark = " + (weightOfAmip - weightOfCell));

        // ornek 10: 

        boolean isExpensive = false;

        String kelime = "57454fgfv+";

        char myLetter= 'M';
        long myNumber = 12000000000000L;
        String myName = "Mustafa";

        System.out.println("myName = " + myName);
        System.out.println("myNumber = " + myNumber);
        System.out.println("myLetter = " + myLetter);

        String isim = "Mehmet";
        String soyisim = "Bulutluoz";

        System.out.println("isminiz  : " + isim);
        System.out.println("soyisminiz  : " + soyisim);

        int sayi1=800;
        byte sayi2=8;
        float sayiFloat = 1.2F;
        char myChar ='~';
        System.out.println("toplam = " + ( sayi1+sayi2 ));
        System.out.println("toplamx = " + ( sayi1+sayiFloat ));
        System.out.println("myCharx = " + (myChar+5));
        System.out.println("toplamy = " + (myChar+sayi1));

//        ornek 11  ( swap )
        int say1=10, say2=20;

        // 1.yol
        int say3;
        say3=say1;
        say1=say2;
        say2=say3;
        System.out.println("say1 = " + say1);
        System.out.println("say2 = " + say2);

        //2.yol  3. variable  olmadan sen yap!














    }
}
