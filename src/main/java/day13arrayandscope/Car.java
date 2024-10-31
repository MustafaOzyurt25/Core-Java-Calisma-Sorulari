package day13arrayandscope;

public class Car {
    // instance variables :
    int year;
    String model;
    double price;
     boolean pazarlikVarmi;

    static String  factoryName =  "hyundai-Tokat";
    static  int  warrantyYears;
     

    public Car(int year, String model, double price, boolean pazarlikVarmi) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.pazarlikVarmi = pazarlikVarmi;
    }

    public Car() {
    }

    public void showFetures(){
        System.out.println("year = " + year);
        System.out.println("model = " + model);
        System.out.println("price = " + price);
        System.out.println("pazarlikVarmi = " + pazarlikVarmi);
       
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Factory Location: " + factoryName);
       
    }
    


   

  

   

}

