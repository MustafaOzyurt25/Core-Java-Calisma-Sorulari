package day04wrapper;

public class WrapperClass {

    public static void main(String[] args) {

        int n =12;  //"n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku "primitive" ler method icermez
      
        Integer m = 12;
//        m.toString();
        
        byte p =15;
        Byte r =14;

        //Ornek 1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short minShort =  Short.MIN_VALUE;
        short maxShort =  Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        //Ornek 2: int data type'inin minimum degeri  ile byte data type'inin maximum degerinin toplamini bulunuz
         
        int minInteger = Integer.MIN_VALUE;
        byte maxByte =Byte.MAX_VALUE;
        System.out.println("maxByte + minInteger= " + (maxByte +minInteger));


        //Ornek 3: i) Primitive int'i wrapper Integer'a ceviriniz
                    
        int k =1000;
        
        Integer l = k;  // Autoboxing
        
        int y = l;   // Unboxing


        //Ornek 4: i) Primitive char'i Wrapper Character'e ceviriniz(Autoboxing)
        
        char myChar = 'M';
//        myChar.  methods yok
        Character wrapperChar = myChar;  //Autoboxing
//        wrapperChar.charValue();  methodsd var.
        //ii) Wrapper Boolean'i primitive boolean'a ceviriniz. (Unboxing )
        Boolean isOld = false;
        System.out.println(isOld.equals(true));  //  false
     
        boolean primitiveBoolean =isOld;  // Unboxing
        
        
        
        
        
        
    }
    
}
