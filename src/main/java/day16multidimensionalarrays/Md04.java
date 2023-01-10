package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //Bir multidimensonal array oluşturunuz ve bir dimensionalli array e donüştürünüz
//[
        int a[][] = {{2, 5}, {3}, {4, 7, 11}};
        //"a" arrrayindeki toplam eleman sayısını bul
        int totalElement = 0;
        for (int[] w : a) {
            totalElement = totalElement + w.length;
        }
        //"b" isimli tek dimensionallı bir array oluştur
        int b[] = new int[totalElement];

        //"a" arrayindeki elemanle-arı "b" arrayine transfer et
        int idx = 0;

        for (int[] w : a) {
            for (int k : w) {
                b[idx] = k;
                idx++;


            }
        }
        System.out.println(Arrays.toString(b));
    }



    }

