package qa13team.ders02;

import java.util.Scanner;

public class Mukemmelsayi {
    public static void main(String[] args) {
       /* 4)    Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
        Input :6
        Output:
        6 Mukemmel Sayidi    (for, if)


        */
        Scanner input=new Scanner(System.in);
        System.out.println("Mükemmel sayı giriniz" );
        int sayi = input.nextInt();//496,8128

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (sayi == toplam) {
            System.out.println("mükemmel sayı");

        } else
            System.out.println("mükemmel sayı değildir");





    }
}