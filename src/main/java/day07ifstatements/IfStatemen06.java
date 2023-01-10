package day07ifstatements;

import java.util.Scanner;

public class IfStatemen06 {
    public static void main(String[] args) {
         /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */
       Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=input.nextInt();
        if (yas<5){
            System.out.println("bebek");
        } else if (yas<13) {
            System.out.println("çocuk");

        } else if (yas<21) {
            System.out.println("genç");

        } else if (yas<31) {
            System.out.println("yetişkin");

        }else {
            System.out.println("tanımlanmamış");

        }
    }
}
