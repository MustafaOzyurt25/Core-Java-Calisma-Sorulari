package day16statickeyword;

public class Counter {
    int count = 0;
    static int stCount;
    static int x;
    int y;

    public Counter() {
       count++;
        System.out.println(count);
//        stCount++;
//        x+=2;
//        y++;

    }

    public int getCount() {
        return count;
    }

    static int getSq() {
        return x * x;
    }

    public static int getStCount() {
        return stCount;
    }

    public static void main(String[] args) {
//        Counter cs1 = new Counter();
//        Counter cs2 = new Counter();
//        Counter cs3 = new Counter();
//        Counter cs4 = new Counter();
//        Counter cs5 = new Counter();
//        Counter cs6 = new Counter();
//        System.out.println("count is: "+cs6.getCount());
//        System.out.println("stCount is: "+Counter.getStCount());
        Counter cs1 = new Counter();
        Counter cs2 = new Counter();
        Counter cs3 = new Counter();
        
//        int z = cs1.getSq();   
//        System.out.println("-x"+z+"-y"+cs2.y);

    }


}// Class
