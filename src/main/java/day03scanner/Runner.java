package day03scanner;

public class Runner {


    public static void main(String[] args) {


        //Object nasil olusturulur?
        //Class Ismi  +  Object Ismi   +   Atama Operatoru  +  "new"  + Constructor

        //"new" keyword'u sifirdan yeni bir object olusturmak icin kullanilir.
        // Constructor Java'da nesneleri olusturmak icin kullanilan ozel bir methoddur. ve 
        // object olusturulmak istendiginde calisir. geriye bir deger dondurmediginden donus turu void dir.?
        
        Car car =new Car();
        
        System.out.println(car.fiyat);
        car.model="hyundai";
        System.out.println(car.model);
        car.hareket();


        Student student =new Student();
        System.out.println("student.name = " + student.name);
        System.out.println("student.grade = " + student.grade);
        student.feed();
        student.playFootball();
        
        student.address="erz";
        System.out.println(student.address);
        

    }
}
