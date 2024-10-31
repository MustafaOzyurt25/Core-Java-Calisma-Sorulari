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
        System.out.println("w".matches("[^#actghnb]")); //  false
        //   [a-z]      a'dan z'ye kadar olan karakterlerden biri olmali a ve z dahil
        //   [a-zA-Z]   a'dan z'ye veya A'dan Z,'ye olan karakterlerden biri olmali
        System.out.println("[a-zA-Z]  quantifier ");
        System.out.println("\"m\".matches(\"[a-z]]\") = " + "M".matches("[a-z]"));  // false
        System.out.println("A".matches("[A-z]"));  // false
        System.out.println("7".matches("[1-9]")); // true

        // X?        X en fazla 1 defa kullanilabilir
        System.out.println("? quantifier...");
        System.out.println("".matches("[bc]?")); // true, a, b veya c en fazla 1 defa

        //  X+        X en az 1 defa kullanilabilir
        System.out.println("+ quantifier ....");

        System.out.println("".matches("[abc]+")); //   false . string ifademizde a, b veya c den  en az bir defa olmali.
        System.out.println("aabaaaaaa".matches("[abc]+"));

        // X*   X sifir veya daha fazla olmali
        System.out.println("ac".matches("[ab]c*"));
//        System.out.println( "ac".matches("[abc]*"));
//        System.out.println("".matches("[abc]*"));
  
        //X{n} X yalniz n adet kullanilMALI.

        // [a-zA-Z0-9]{6}  a-z, A-Z ve 0-9 arasi toplam 6 karakter olmali
        System.out.println("X{n} quantifier...");
        System.out.println("0001000".matches("[a-zA-Z0-9]{7}"));
        System.out.println("#####&".matches("[^a-zA-Z0-9]{6}")); // true

        // X{n,}      X  n veya daha fazla adet kullanilabilir
        // [a-zA-Z0-9]{6,}  a-z, A-Z ve 0-9 arasi toplam en az 6 karakter olmali
        System.out.println("atcam".matches("[a-zA-Z0-9]{5,}"));

        // X{n,m}      X  en az n fazla m adet kullanilabilir
        System.out.println("##$aaa111".matches("[^A-z0-9]{2,5}[A-z0-9]{6,20}"));
        System.out.println("by character classes and quantifiers ...");
        // ilk karakter 789 ve kalan 9 karakter 0-9 arasi toplam 10 karakter olmali,
        // [789]{1}  == [789]
        System.out.println("2123456789".matches("[789]{1,2}[0-9]{9}"));

        String b = "Java 1235 ?!@$_";
        System.out.println(b.replaceAll("\\D", "*"));// Java **** ?!@$_


    } // main
}
