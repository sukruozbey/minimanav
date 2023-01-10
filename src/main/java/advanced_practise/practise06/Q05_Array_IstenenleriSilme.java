package advanced_practise.practise06;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Array_IstenenleriSilme {
    //Bir  integer Array'de verilen bir değer dışındaki elamanlarý  yeni bir Array olarak yazdýran bir method yazýnýz.
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 5, 5};

        System.out.println(Arrays.toString(istenileniSil(arr)));


    }

    public static int[] istenileniSil(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Silmek istediğiniz elemanı giriniz");
        int silinecek = input.nextInt();

        int length = 0;

        for (int w : arr) {
            if (w != silinecek) {
                length++;
            }
        }

        System.out.println("length = " + length);
        int[] arrSilinmis = new int[length];
        int idx = 0;

        for (int w : arr) {
            if (w != silinecek) {
                arrSilinmis[idx] = w;
                idx++;
            }
        }

        return arrSilinmis;
    }
}
