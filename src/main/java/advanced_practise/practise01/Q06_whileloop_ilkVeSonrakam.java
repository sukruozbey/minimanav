package advanced_practise.practise01;

import java.util.Scanner;

public class Q06_whileloop_ilkVeSonrakam {
    public static void main(String[] args) {

        //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

            Scanner input = new Scanner(System.in);
            System.out.println("Bir tamsayi giriniz");
            int sayi = input.nextInt();

            //1. Yol:
            int sonRakam = sayi%10;
            System.out.println("sonRakam = " + sonRakam);
            int ilkRakam = sayi;

            while (ilkRakam>9){

                ilkRakam /= 10;

            }
            System.out.println("ilkRakam = " + ilkRakam);
            System.out.println("Toplam: "+(ilkRakam+sonRakam));

            //2. Yol:
            System.out.println("==String Ile==");
            String sayiString = String.valueOf(sayi);
            int strIlkRakam = Integer.parseInt( sayiString.substring(0,1));
            int strSonRakam = Integer.parseInt(sayiString.substring(sayiString.length()-1));
            System.out.println("Toplam: "+(strIlkRakam+strSonRakam));

    }
}
