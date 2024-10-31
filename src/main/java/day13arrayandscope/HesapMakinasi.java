package day13arrayandscope;

import java.util.Scanner;

public class HesapMakinasi {
    //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
    //Kullanici "q" ya basmadigi surece islem secip yapabilsin
    //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
    //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
    // "Undefined operation" mesaji verilerek uygulama dursun
    // 1- hangi islemi yapacagini soralim. 
    // 2-

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opr = "";
        System.out.println("To stop calculation press  q");
        while (!opr.equalsIgnoreCase("q")) {
            System.out.println("lutfen yapmak istediginiz islemi seciniz ( +, -, *, /, % ) : ");
            opr = scanner.next();
            if (opr.equalsIgnoreCase("q")) {
                System.out.println("see you again");
                break;
            }
            if (opr.matches("[^-+*/%]")) {
                System.out.println("Undefined operation");
                break;
            }
            double num1 = 0;
            double num2 = 0;
            Object sonuc;
            try {
                System.out.println("lutfen 1. sayiyi giriniz");
                num1 = scanner.nextDouble();
                System.out.println("lutfen 2. sayiyi giriniz");
                num2 = scanner.nextDouble();
                sonuc = 0;
                switch (opr) {
                    case "+":
                        sonuc = num1 + num2;
                        break;
                    case "-":
                        sonuc = num1 - num2;
                        break;
                    case "*":
                        sonuc = num1 * num2;
                        break;
                    case "/":
                        sonuc = num1 / num2;
                        break;
                    case "%":
                        sonuc = num1 % num2;
                        break;
                }

            } catch (Exception e) {
                System.out.println("lutfen gecerli giris yapiniz .. sayi girmeliisniz");
                break;
            }
            System.out.println(sonuc);
        }


    }


}
