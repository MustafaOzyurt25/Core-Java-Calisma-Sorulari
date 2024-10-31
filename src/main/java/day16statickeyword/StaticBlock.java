package day16statickeyword;

public class StaticBlock {
    public static int age;
    int yas;

    static {
        System.out.println("Static block 2 calisti");
        age = 24;
    }
    

    static {
        System.out.println("Static block 1 calisti");
        age = 23;
        System.out.println(age);
    }

    public StaticBlock() {
        System.out.println("Constructor calisti");
        System.out.println(++age);
    }

    public static void main(String[] args) {
        System.out.println("main method calsiti 1");
        System.out.println(++age);
        System.out.println(++age);
        System.out.println(age);
        StaticBlock obj = new StaticBlock();
        System.out.println("main method calsiti 2");
        System.out.println(obj.yas);
    }

}
