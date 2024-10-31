package day01variables;

public class Main {
    public static void main(String[] args) {
        
        int num1 =10;
        int num2=num1;
        System.out.println("num2 = " + num2);
        num2=20;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
        
        Person person1 =new Person("mehmet",10);
        Person person2 =person1;
        person2.setName("Bob");
        person2.setAge(30);
        System.out.println("person2'nin isimi = " + person2.getName());  // Bob
        
        System.out.println("person1'nin isimi = " + person1.getName());
        
        
        
        
        
        
        
    }
    
}
