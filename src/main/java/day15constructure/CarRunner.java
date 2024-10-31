package day15constructure;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1025489,"toyota");
        System.out.println("car2 : "+ car2);
        
        car1.ilanNo = 10265;
        car1.yil = 2010;
        car1.model = "doch start";
        car1.marka = "hyundai";
        car1.fiyat=1000;
       
        car1.yakit("mazot");
        Car.hiz(240);
        System.out.println(
                car1.ilanNo + ","+ car1.marka+","+ car1.fiyat + "," + car1.yil + "," + car1.model
        );
        System.out.println(car2.hashCode());  // 935044096
      
        
       
        
    }
}
