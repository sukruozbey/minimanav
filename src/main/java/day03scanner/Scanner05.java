package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //1 alanını hesaplayınız
        //Cevresini hesaplayınız
        Scanner input =new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu gir");
        float shortSide = input.nextFloat();
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu gir");
          float longSide = input.nextFloat();
        System.out.println("Alan=" + (shortSide*longSide));
        System.out.println(2*shortSide+2*longSide);





    }
}
