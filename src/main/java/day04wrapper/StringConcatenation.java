package day04wrapper;

public class StringConcatenation {

    public static void main(String[] args) {
        String a = "Hello";
        int b =2;
        int c =3;

//        System.out.println(a+b+c);
//        System.out.println(c+b+a);// 5Hello  yani ==>  5 + "Hello" = "5Hello"
//        System.out.println("5Hello");
//        System.out.println(a+(b+c)); // Hello5
        System.out.println(a+b*c); // Hello6
        
        String str1 ="Java";
        String str2 ="Guzel";
        int sayi1=5;
        int sayi2 =4;

        System.out.println(str1 + " " + str2 + " " + sayi1+sayi2);// Java Guzel 54
        System.out.println(str1 +" "+ sayi1+ " "+str2);// Java 5 Guzel
        System.out.println(str1 +" "+ (sayi1+sayi2)+ sayi2);// Java 94
        System.out.println(str1 +" "+ (sayi1-sayi2)+ (sayi2+sayi1));// Java 19
        System.out.println(sayi1+(sayi2+" "+str2));// 54 Guzel
        
        
        boolean sonuc1=5*2 <= 7;
        System.out.println("sonuc1 = " + sonuc1);

        System.out.println(5*2 < 7);
        System.out.println(false);
        
        boolean sonuc2 = (5+2 ==7)&&(4+3 !=5);
        System.out.println((5*2 !=15)&&(5>7));
                
        boolean sonuc3 = (5+2==7)||(4+3!=5);
        System.out.println("StringConcatenation.main");

        System.out.println((5*2==15)||(5>7));
        
        
        
        
        
        
        
    }
}
