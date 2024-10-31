package day13arrayandscope;

public class Scope1 {
    private static int num2;
    int num1;
    static String name = "Ali";
    

    public static void main(String[] args) {
        product(5);
//        add();
        
        
        
        
    }// main

     static void product(int num3) {
//        num1++;
//        int num2 =6;
         num2=5;
        char letter;
        System.out.println("do addition ");
         System.out.println("num2 = " + num2);
    }

    public  void add() {
        name ="veli";
        num2=10;
        System.out.println("num2 = " + num2);
        num1=7;
    }

}
