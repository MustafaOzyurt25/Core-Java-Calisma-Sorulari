package day09passbyvaluemethodverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {
        System.out.println(add(10.3, 10.2));
        System.out.println(add(10, 11, 14));
        System.out.println(add(10.0, 8));
        System.out.println(add(20, 7.0));


    }

    private static double add(double v, double v1) {
        
        return v+v1;
    }


    private static double add(double v, double v1,double v2) {

        return v+v1+v2;
    }

    private static double add(double v, int v1) {

        return v+v1;
    }

    private static double add(int v1, double v) {

        return v+v1;
    }


    


}
