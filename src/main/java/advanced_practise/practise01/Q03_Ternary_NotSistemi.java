package advanced_practise.practise01;

import java.util.Scanner;

public class Q03_Ternary_NotSistemi {


      /*
   Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
   (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
    */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Notunuzu sayi cinsinden giriniz");
            int notSayi = input.nextInt();

         String nothafrf= notSayi>100 ?"100 den küçük sayı giriniz":notSayi>89 ?
                 "A":notSayi>79 ?
                 "B":notSayi>69?
                 "C":notSayi>59 ?
                 "D":notSayi>49 ?
                 "E":
                 "F";


    }
}
