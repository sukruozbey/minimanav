package qa13team.ders02;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
       /* 5)Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve "Negatif sayi
        giremezsiniz" yazdirip basa donun
        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi
        girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.    (do while) (edited)

        */
        Scanner input=new Scanner(System.in);
        int sayi;


        int countneg=0;
        int countpoz=0;
        int toplam=0;

        do {
            System.out.println("Lütfen Toplamak istediğiniz sayıları girin ,Çıkmak için 0' a basın");
             sayi=input.nextInt();
            if (sayi==0){
                break;

            }else if (sayi<0){
                System.out.println("Negatif sayı giremezsiniz");
                countneg++;
                continue;


            }else{

                toplam+=sayi;
                countpoz++;

            }




        }while (true);
        System.out.println("toplam = " + toplam);
        System.out.println("countpoz = " + countpoz);
        System.out.println("countneg = " + countneg);


    }
}
