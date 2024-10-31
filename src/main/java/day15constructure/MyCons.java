package day15constructure;

public class MyCons {
    int x = 5;

    MyCons() {
        System.out.println("-x" + x);

    }

    MyCons(int x) {
        this();
        System.out.println("-x" + x);

    }

    public static void main(String[] args) {
        MyCons mc1 = new MyCons(4);
        MyCons mc2 = new MyCons();

    }


}
