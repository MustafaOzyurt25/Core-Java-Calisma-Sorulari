package day07stringmanipulation;

public class RegexForString {
    public static void main(String[] args) {
        // str.matches(pattern);
        // str'nin pattern'a uygun olup olmadigini kontrol eder. sonuc boolean döner
        // . (nokta) yalniz tek karakter demektir
        // ".s" toplam 2 karakter olmali, ilk karakter herhangi ikinci karakter s olmali
        System.out.println(". quantifier ....");
        System.out.println("as".matches(".s"));// true
        System.out.println("m.s".matches("..s"));
        // [abc]    yalniz bir karakter ve a, b veya  c olmali
        System.out.println("[abc] quantifier");
        System.out.println("ab".matches("[ab]")); // false, 1 karakter olmali a ya da b, 2 karakter var
        System.out.println("[^...] quantifier ....");
        // [^abc]   a, b, c disinda herhangi bir karakter (negation)
        System.out.println("w".matches("[^#actghnhgb]")); //  false
        //   [a-z]      a'dan z'ye kadar olan karakterlerden biri olmali a ve z dahil
        //   [a-zA-Z]   a'dan z'ye veya A'dan Z,'ye olan karakterlerden biri olmali
        System.out.println("[a-zA-Z]  quantifier ");
        System.out.println("\"m\".matches(\"[a-z]]\") = " + "M".matches("[a-z]"));  // false
        System.out.println("A".matches("[A-z]"));  // false
        System.out.println("7".matches("[1-9]")); // true

        // X?        X en fazla 1 defa kullanilabilir
        System.out.println("? quantifier...");
        System.out.println("".matches("[abc]?"));
        System.out.println("".matches("bc?")); // true, a, b veya c en fazla 1 defa


    }// main
}
