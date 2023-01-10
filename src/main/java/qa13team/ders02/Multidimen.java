package qa13team.ders02;

import java.util.Arrays;

public class Multidimen {
    public static void main(String[] args) {
      /*  3)   Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini
        birer birer bulan ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana
        yazdiran bir program yaziniz {{1,2,3}, {4,5}, {6,7}}
        Ornek; {{1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

       */
        int [][]arr={{1,2,3}, {4,5}, {6,7}};

        int []newArr=new int[arr.length];

        int idx=0;
        for (int [] w:arr){
           int toplam=0;
            for (int k:w){
                toplam+=k;


            }
            newArr[idx]=toplam;
            idx++;

        }

        System.out.println(Arrays.toString(newArr));






    }
}
