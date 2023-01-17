package tekrar;

import day08nestedifternary.Ternary01;

import java.util.*;

public class Tekrar1 {
    public static void main(String[] args) {
       /*
```Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
LinkedList elemanları: sari,mavi,mor,yesil,beyaz
eklenen Çıktı:
``sari
`mavi```
mor````
yesil```
beyaz
```      */

        List<String> likedList=new ArrayList<>();
        likedList.add("sari");
        likedList.add("mavi");
        likedList.add("mor");
        likedList.add("yesil");
        likedList.add("beyaz");



        for (String w:likedList){
            System.out.println(w);
        }











    }
}