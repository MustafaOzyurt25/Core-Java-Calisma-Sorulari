package day09passbyvaluemethodverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        int shirtPrice = 100;
        int ogrenciFiyati =discount("ogrenci",shirtPrice);  // java metoda  referanca'i degil, orjinal degeri de degil.! orj degerin kopyasini gonderir.
        System.out.println(shirtPrice);  // 100
        System.out.println(ogrenciFiyati); // 80
        System.out.println(discount("esnaf",shirtPrice));// 95
        System.out.println(discount("garson",shirtPrice));// 100  garson ' a indirim yok!
        
        
         /* Pass by value
        1) Java Pass by Value kullanir.
        2) yani; java method larin orjinal degeri degistirmesine musaade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda a yollar
            Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur
        4)Java esnek bir dildir, Istersek yazdigimiz kod ile   orjinal degerin degismesini temin edebiliriz
        bakiniz line 24:

        Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir


     */
    }// main

    private static int discount(String musteri, int price) {
        // ogrenci, ogretmen, esnaf  .. garson
        switch (musteri) {
            case "ogrenci":
                price -= 0.2 * price;
                break;
            case "ogretmen":
                price -= 0.1 * price;
                break;
            case "esnaf":
                price -= 0.05 * price;
                break;
            default:
                price = price;


        }
        return price;
    }


}
