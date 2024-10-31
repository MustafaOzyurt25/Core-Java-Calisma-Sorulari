package day09passbyvaluemethodverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
        // bir isim guncelleyen metod yaz. ama name degisiyor mu degismiyor mu bir bakalim.
        System.out.println(isimGuncelle(name,"Ali"));  // Tom Hanks Ali.
        System.out.println(name);  // Tom Hanks
        name=isimGuncelle(name,"Ali");  // burda kasti olarak name degistirildi.
        System.out.println(name); // Tom Hanks Ali
    }

    private static String isimGuncelle(String name, String ek) {
     name =name + " " + ek;
return name;
    }


}
