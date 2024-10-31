package day16statickeyword;

public class Deneme {
    int x;
    static int y;

    Deneme(int i) {
        x += i;
        y += i;

    }

    public static void main(String[] args) {
        new Deneme(2);
        Deneme dnm=new Deneme(3);
        System.out.println(dnm.x+ ", "+ dnm.y);
        y=5;
     
    }

    public  void main1() {
        new Deneme(2);
        Deneme dnm=new Deneme(3);
        System.out.println(dnm.x+ ", "+ dnm.y);
        y=5;
        x=4;
        

    }
    


}// Deneme
