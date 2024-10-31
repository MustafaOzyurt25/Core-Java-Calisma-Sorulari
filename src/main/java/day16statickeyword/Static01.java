package day16statickeyword;

public class Static01 {
    
    
    
    
    static  int count =0;
    int count2 =5;
    
    
    public void increment(){
       count++; 
    }

    public static void main(String[] args) {

        Static01 obj01 = new Static01();
        Static01 obj02 = new Static01();

        obj01.increment();
        obj02.increment();
//        System.out.println(count2);
        System.out.println(count);
        System.out.println(obj02.count2);
    }

    
    
    

}



