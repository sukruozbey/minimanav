package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanıcıdan adres ini alınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adresinizi giriniz...");
        String address = input.next();
        System.out.println(address);

    }
}
