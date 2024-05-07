package day02datatypesmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {
//  1.yol:
//  System.out.println(topla(5, 6));

        //2.yol
//        int toplam =topla(5,6);
//        System.out.println("toplam = " + toplam);

        topla(5, 6);


        //  System.out.println("carpmaYap( 6,9) = " + carpmaYap(6, 9));
        int carpmaSonucu = carpmaYap(6, 8);
        System.out.println("carpmaSonucu = " + carpmaSonucu);
        System.out.println("multiplyFirstTwoNumberAndaddThird(2,3,5) = " + multiplyFirstTwoNumberAndaddThird(2, 3, 5));
        System.out.println("getCube(2.5) = " + getCube(2.5));
        printWord("Ahmet");


    }//main

    //Ornek1: toplama islemi yapan bir method olusturunuz
    public static int topla(int a, int b) {
        //System.out.println("toplam = " + toplam);
        return a + b;
    }

    //Ornek 2:  2 sayiyi carpma islemi yapan bir method olusuturunuz
    public static int carpmaYap(int a, int b) {
        return a * b;
    }

    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile taplayan methodu olusturunuz
    private static int multiplyFirstTwoNumberAndaddThird(int a, int b, int c) {

        return a * b + c;
    }

    //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    //NOTE: ACCESS MODIFIER'I default YAPMAK icin access modifier YAZMAYİNİZ

    static double getCube(double a) {

        return a * a * a;
    }

    //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz

    public static void printWord(String word) {

        System.out.println(word);
    }


}// class
