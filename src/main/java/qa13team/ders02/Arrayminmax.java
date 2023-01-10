package qa13team.ders02;

import java.util.Arrays;

public class Arrayminmax {
    public static void main(String[] args) {
        // 1) Array listesindeki minimum maximum  ve 2. en büyük sayıyı bulan Java Kodunu yazınız.
        // Array: [1232,2345,5467,678,3454,2312,3451]       (arrayi icindeki sayilari daha basit koyabilirsinz)

        int[]sayi={1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));

        System.out.println("en küçük sayı="+sayi[0]);
        System.out.println("2.en büyük"+sayi[sayi.length-2]);
        System.out.println("en büyük sayı="+sayi[sayi.length-1]);
        int min=sayi[0];
        int max=sayi[0];
        for (int w:sayi){
           min= Math.min(w,min);
           max= Math.max(max,w);
        }
        System.out.println(sayi[sayi.length-2]);
        System.out.println(min);
        System.out.println(max);

    }
}
