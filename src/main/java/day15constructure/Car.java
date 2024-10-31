package day15constructure;

public class Car {
    int ilanNo;
    String marka;
    String model;
    int yil;
    int fiyat;

    public Car() {
    }

    public Car(int i, String m) {
        this.ilanNo = i;
        this.marka = m;
       
    }

 
//    @Override
//    public String toString() {
//        return "Car{" +
//                "ilanNo=" + ilanNo +
//                ", marka='" + marka + '\'' +
//                ", model='" + model + '\'' +
//                ", yil=" + yil +
//                '}';
//    }



    public static void hiz(int maxHiz) {
        System.out.println("max " + maxHiz + " km/saat hiz yapmaktadir");
        
    }

    public void yakit(String yakitTuru) {
        System.out.println(yakitTuru + " ile calismaktadir");
    }


}
