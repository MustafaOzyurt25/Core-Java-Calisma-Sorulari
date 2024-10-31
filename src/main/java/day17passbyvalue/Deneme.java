package day17passbyvalue;

public class Deneme {
    
    

    public static void main(String[] args) {
        int fiyat =100;
        System.out.println(" %10 luk indirim: "+ discount10(fiyat));;
        System.out.println(" %20 luk indirim: "+ discount20(fiyat));;
        System.out.println(" %25 luk indirim: "+ discount25(fiyat));;
        System.out.println("orjinal fiyat : "  +fiyat);
    
    }

    private static int discount10( int fiyat) {
        return fiyat *=0.9;
       
    }

    private static int discount20( int fiyat) {
        return fiyat *=0.8;
    }

    private static int discount25( int fiyat) {
        return fiyat *=0.75;
    }
    
    
    
    
    
//    public static void discount(String type , int fiyat){
//        if (type.equalsIgnoreCase("student")){
//            fiyat -=50;
//        } else if (type.equalsIgnoreCase("ogretmen")) {
//            fiyat -=30;
//        }else {
//            fiyat=fiyat;
//        }
//        System.out.println(fiyat);
//
//
//    }
    
    
    
    
    
}
