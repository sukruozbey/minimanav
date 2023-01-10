package advanced_practise.practise01;

import java.util.Arrays;

public class Q05_ForEach_Eourodolar {
    public static void main(String[] args) {
       /*
   Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
   Örnek:
   String str ="$1 $12 €34 €56 $45 €78";
     dolarToplami: 58
     euroToplami: 168
    */

            String str ="$1 $12 €34 €56 $45 €78";
            String[] arr = str.split(" ");
            System.out.println(Arrays.toString(arr));//[$1, $12, €34, €56, $45, €78]

            int dolarToplam = 0;
            int euroToplam = 0;
            for (String w : arr){

                if(w.contains("$")){
                    dolarToplam += Integer.parseInt(w.replaceAll("\\D",""));
                }else {
                    euroToplam += Integer.parseInt(w.replaceAll("\\D",""));
                }
            }
            System.out.println("dolarToplam = " + dolarToplam);
            System.out.println("euroToplam = " + euroToplam);

        }
}
