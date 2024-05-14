package day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        
        
        
          /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yaziniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France ulke  isimlerinden birini giriniz");
        String countryName = scanner.next();
        String sonuc = "";
        switch (countryName.toLowerCase()) {
            case "america":
                sonuc = "US";
                break;
            case "england":
                sonuc = "UK";
                break;
            case "germany":
                sonuc = "DE";
                break;
            case "Turkey":
                sonuc = "TR";
                break;
            case "India":
                sonuc = "IN";
                break;
            default:
                sonuc = "belirtilen ulkelerden giriniz  ";
        }
        System.out.println(sonuc);


    }
}
