package day13arrayandscope;

public class Runner {
    public static void main(String[] args) {
//        Car.warrantyYears =3;
//        Car.factoryName="Honda-Tokat";
//        Car car1 = new Car(5, "X",1000,true);
        Car car1 = new Car();
        
        Car car2 = new Car();
        car2.model="doch start";
        car2.showFetures();
        Car.factoryName = "BMW - Tokat";
        Car.warrantyYears = 10;
        car1.warrantyYears=20;
        car1.year = 6;
        car1.model = "SQ";
        car1.price = 100000;
        car1.showFetures();
        
      
    
        
        

    }

}
