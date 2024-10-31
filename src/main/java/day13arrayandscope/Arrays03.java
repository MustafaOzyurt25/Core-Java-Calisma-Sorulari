package day13arrayandscope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        /*
        Kullanicinin coklu data'yi bir array'e yerlestirebilmesi istedigi zaman durdurabilmesi icin gereken kodu yaziniz.
         scanner objesi olacak ve kac data yerlestirecegini sorulmali kullanciya
         data alma isi aksi belirtilmedikce devam edeecek/ loop
         arrary olusumu nerde olmali
         
         1. yol Array kullanarak: 
                Scanner scanner = new Scanner(System.in);
                System.out.println("lutfen gireceginiz data sayisini belirtiniz...: ");
                int numOfData = scanner.nextInt();
                int[] nums = new int[numOfData];
                System.out.println("cikmak icin Q YA BASINIZ");
                for (int i = 0; i < numOfData; i++) {
                    System.out.println("lutfen bir sayi giriniz...: ");
                    String girilenSey = scanner.next().substring(0, 1);
                    if (girilenSey.equalsIgnoreCase("q")) {
                        System.out.println("cikis yaptiniz...tekrar bekleriz...");
                        break;
                    } else if (girilenSey.matches("[^0-9]")) {
                        System.out.println("sayi girmelisiniz -->");
                        i--;
                    } else {
                        int girilenSayi = Integer.valueOf(girilenSey);
                        nums[i] = girilenSayi;
                    }
                }
                System.out.println(Arrays.toString(nums));
        */

//        2. yol ArrayList  kullanarak:
        Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> userData =new ArrayList<>();
//        int[] nums = new int[5];
        String input;
        System.out.println("Veri girmeye başlayın (durdurmak için 'stop' yazın):");
        while (true) {
            System.out.print("Lütfen bir sayı girin: ");
            input = scanner.nextLine();
            // 'stop' komutu girildiğinde döngüden çık
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                // Kullanıcıdan alınan veriyi integer'a çevir ve array'e ekle
                int number = Integer.parseInt(input);
                userData.add(number);
            } catch (NumberFormatException e) {
                // Hatalı veri girişi durumunda uyarı mesajı ver
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
            }
        }
        // Kullanıcıdan alınan verileri yazdır
        System.out.println("Girdiğiniz veriler:");
//        System.out.println(Arrays.toString(userData.toArray()));
        userData.forEach(System.out::println);
//        for (int number : userData) {
//            System.out.println(number);
//        }
        scanner.close();


    }


}
