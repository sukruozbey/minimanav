package day03scanner;

import java.util.Scanner;

public class scanner02 {
    public static void main(String[] args) {

        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

        Scanner input =new Scanner (System.in);

        System.out.println("İlk isminizi giriniz...");
        //next() method kullanicidan "tek kelimeli String" almak icin kullanilir.
        String firstName =input.next();

        System.out.println("Soy isminiz giriniz");
        String lastName=input.next();
        System.out.println(firstName+" "+lastName);

    }
}
