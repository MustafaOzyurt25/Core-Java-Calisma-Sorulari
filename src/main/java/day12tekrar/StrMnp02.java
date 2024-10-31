package day12tekrar;

import java.util.Scanner;

public class StrMnp02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "";
        do {
            System.out.println(">>lutfen sifrenizi giriniz : \n" +
                    "i) En az 8 karakterden olussun\n " +
                    "ii) Password space icermesin\n" +
                    "iii) En az 1 tane buyuk harf olsun\n" +
                    "iv) En az 1 tane kucuk harf olsun\n" +
                    "v) En az 1 tane sembol olsun\n" +
                    "vi) En az 1 tanede rakam olsun");
       password= scanner.nextLine();
            
        }while (!isValidPassword(password));

        System.out.println("isValidPassword(password) = " + isValidPassword(password));
        
 
       
        
        
        
        /*
 String s  deki tum rakamalari * ile deg.
        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";
        System.out.println(s.replaceAll("[0-9]", "*"));
        // String s  deki tum rakamalari ve harfleri "@" ile deg.
        System.out.println(s.replaceAll("[0-9A-z]", "@"));
        System.out.println(s.endsWith("money"));
        // String s  deki tum space ler disindaki karakterleri "+" ya cev
        System.out.println(s.replaceAll("[^ ]", "+"));
        // String s  deki tum sesli harfler disindaki karakterleri "$" ya ceviriniz
        System.out.println(s.replaceAll("[^aeoui]", "\\$"));  // $ karakteri regex icin ozel bir anlam tasidigindan onune kacis isareti olan \\ koyduk
*/
    
        /*
        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun
                */
/*
        String pasw = "Ca@7dvlvspdvs";
        boolean uzunlik = pasw.length() > 7;
        boolean isExistSpace = !pasw.contains(" ");
        boolean isExistCapital = pasw.replaceAll("[^A-Z]", "").length() > 0;
        boolean isExistLower = pasw.replaceAll("[^a-z]", "").length() > 0;
        boolean isExistSymbol = pasw.replaceAll("[^A-z0-9]", "").length() > 0;
        boolean isExistNumber = pasw.replaceAll("[^0-9]", "").length() > 0;
        
        boolean gecerliPassw = uzunlik&&isExistCapital&&isExistLower&&isExistSymbol&&isExistSpace&&isExistNumber;
        System.out.println("gecerliPassw = " + gecerliPassw);
*/
        
        
        
    }

    public static boolean isValidPassword(String password) {
        // En az 8 karakterden oluşmalı
        if (password.length() < 8) {
            return false;
        }

        // Şifre space içermemeli
        if (password.contains(" ")) {
            System.out.println("Şifre space içermemeli");
            return false;
        }

        // En az 1 tane büyük harf olmalı
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("En az 1 tane büyük harf  olmali!");
            return false;
        }

        // En az 1 tane küçük harf olmalı
        if (!password.matches(".*[a-z].*")) {
            System.out.println("En az 1 tanede küçük harf  olmali!");
            return false;
        }

        // En az 1 tane sembol olmalı (sembollerin listesi genişletilebilir)
        if (!password.matches(".*[^A-z0-9].*")) {
            System.out.println("En az 1 tanede sembol olmali!");
            return false;
        }

        // En az 1 tane rakam olmalı
        if (!password.matches(".*[0-9].*")) {
            System.out.println("En az 1 tanede rakam olmali!");
            return false;
        }

        return true;
    }
    
    
    
    
}
