package day15constructure;

public class Student {
    
    String name ;
    int age ;
    String phone;

    public Student() {
    }
    
    

    public Student(String name, int age,String phone) {
        this.phone = phone;
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = 22;
    }

    public static void main(String[] args) {

        
        
       Student s1 =new Student();
       Student s2 =new Student("jo", 25, "029-45163");
       
        
        Student st =new Student("oliver", 21);
        System.out.println(s2.name + ", "+s2.age + ", " + s2.phone);
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
