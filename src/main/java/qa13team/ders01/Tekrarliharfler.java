package qa13team.ders01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tekrarliharfler {
    public static void main(String[] args) {
      /*  1)   Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :   String str="Javaisalsoeasy"     Output: a s        (FOR İLE)

       */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle=input.nextLine();

        String newcumle = cumle.replaceAll("[^a-zA-Z] ", "").trim().toLowerCase().replaceAll("\\s+","");

        String[] array = newcumle.split("");

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//Java  İle Vazgecme  ,
        List<String> list = new ArrayList();

        String yeniharfler = "";
        for (int i = 1; i < array.length; i++) {

            if (array[i].equals(array[i - 1] )&& !array[i].equals(yeniharfler)) {
                yeniharfler = array[i];
                list.add(yeniharfler);
            }
        }
        System.out.println(list);


    }
}




































      /*  2)        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        Input :30  40
        Beklenen Cikti:
        30 ve 40 icin GCD = 10                 ( FOR İLE)
        30 ve 40 icin LCM = 120

        3)Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.
                Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2   (ARRAY)

                4)Kullanicidan ismini soy ismini ve kredi karti bilgilerini isteyin ve asagida ki gibi yazdirin
        Isim-Soyisim: A*** G***
        Kart-No: **** *** *** 1907  ( if ve string manipulation)(16 haneden eksik yada fazla girerse hatali girdiniz yazsin)

/*    5)  Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

      Array: [1,2,3,4,5,6,7,8,9]   (for each)

       */


