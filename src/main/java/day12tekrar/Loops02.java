package day12tekrar;

public class Loops02 {
    public static void main(String[] args) {
        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String s = "Pwd12?Ab.";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                continue;
            }
            System.out.print(ch);

        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            }
            System.out.print(ch);
        }
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20
        int sum = 0;
        int num = -578;
        num = Math.abs(num);
        for (int i = num; i > 0; i = i / 10) {
            sum = sum + i % 10;

        }
        System.out.println(sum);


    }
}
