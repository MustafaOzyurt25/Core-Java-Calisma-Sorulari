package day12tekrar;

public class Loops01 {
    public static void main(String[] args) {
        /*
Example 2 : Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
             ankara ==> AKR
        String s = "ankara";
        String kutu = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                kutu += s.substring(i, i + 1).toUpperCase();
            }
        }
        System.out.println(kutu);
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }

        }
        System.out.println();
        StringBuilder result = new StringBuilder();
        System.out.println(result.toString());
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        System.out.println(result.toString());
        //Example 1: Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        String s1 = "I love Java";  //       ==> "I love J"
        for (int i = 0; i < s1.indexOf("a"); i++) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }
*/
        System.out.println();
        //Example 2: Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        // "Garmany" ==>yn
        String s2 = "Gdrmdny";
        StringBuilder bosKutu = new StringBuilder();


        String input = "Germnya";
        int lastIndex = input.lastIndexOf('a');

        if (lastIndex != -1 && lastIndex < input.length() - 1) {
            String substring = input.substring(lastIndex + 1);
            String reversed = new StringBuilder(substring).reverse().toString();
            System.out.println(reversed);
        } else {
            System.out.println("No characters to reverse after the last 'a' or 'a' is at the end.");
        }
    }

    
    /*
        if (s2.contains("a")) {
            for (int i = s2.length() - 1; i >= 0; i--) {
                char ch = s2.charAt(i);
                if (ch == 'a') {
                    break;
                }
                System.out.print(ch);
            }
        } else {
            System.out.println("kelimede a harfi bulunmamaktadir");
        }
*/
    }






