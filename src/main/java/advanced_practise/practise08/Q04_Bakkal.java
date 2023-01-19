package advanced_practise.practise08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {
   /*
   Bakkal günlük gelir programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
            */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun =0;
        while (gun<7){
            System.out.println(gunler.get(gun)+" gününün kazancını giriniz");
            gunlukKazanclar.add(input.nextDouble());
            gun++;

        }



    }




}
