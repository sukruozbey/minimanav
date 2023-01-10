package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

//Multidimensional array nasıl oluşturulur?
        int a[][] = new int[3][2];
        //Multidimensional array nasıl yazdırılır?
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]
        //Multidimensional array nasıl eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[2][1] = 0;
        a[1][0] = 81;
        System.out.println(Arrays.deepToString(a));

        //Note: Array'lere non-primitive data konulamaz.
//      Array'lere primitive data veya reference konulur.
//      Ama siz bir array'i yazdirmak istediginizde Java adres'ler yardimi ile non-primitive data'ya ulasir
//      ve o non-primitive data'yi sanki array'in icindeymis gibi gosterir.

        //Multidimensional Arraylerdeki belli elemnalara nasıl ulaşılır?
        System.out.println(Arrays.toString(a[2]));
        System.out.println(a[1][0]);
        System.out.println(Arrays.toString(a[0]));
        System.out.println(a[2][1]);
    }

}
