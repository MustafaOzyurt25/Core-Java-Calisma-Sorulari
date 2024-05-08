package day04wrapper;

public class DataCasting {

    public static void main(String[] args) {
        // soru 1    Auto widening.
        byte maas = 100;
        short shortMaas = maas;
        System.out.println("shortMaas = " + shortMaas);
        int intMaas = maas;
        float fMaas = intMaas;
        double dMaas = fMaas;
        System.out.println("dMaas = " + dMaas);

        // soru 2 narrowing

        int sayfaSayisi = 1000550;
        short shortSayfaSayisi = (short) sayfaSayisi;
        System.out.println("shortSayfaSayisi = " + shortSayfaSayisi);
        byte byteSayfaSayisi = (byte) shortSayfaSayisi;
        System.out.println("byteSayfaSayisi = " + byteSayfaSayisi);

//        boolean myChar = (boolean) byteSayfaSayisi; Inconvertible types; cannot cast 'byte' to 'boolean'

        // soru3 

        float floatData = 10.2f;
        System.out.println("floatData = " + floatData);
        int intData = (int) 255.36;
        System.out.println("intData = " + intData);

        byte byteDta = (byte) intData;
        System.out.println("byteDta = " + byteDta);  // byteDta = -1 . narrowing data kaybi olabilir.

        int sayi1 = 100;
        int sayi2 = 9;
        double sayi3 = 10;
        
        System.out.println("sayi1/sayi3 = " + (sayi1 / sayi3)); // sonuc tamsayi!
    
        // soru 7:
        
        float pm= 102F;
        float f =10.2f;
        System.out.println("f/pm = " + pm/f);
        
         
        
        

    }


}
