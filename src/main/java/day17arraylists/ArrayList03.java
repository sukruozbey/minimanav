package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        //remove() metodu index ile kullanılırsa o indextekini  siler
        //remove() metodu index ile kullanılırsa size sildiği elemanı verir
        String n=cities.remove(1);//indexe göre
        System.out.println("n = " + n);
        //remove() metodu eleman ile kullanılırsa ilk görünümü siler
        //remove() metodu eleman ile kullanılırsa size o elemanı silip silmediğini söyler
        //eğer eleman Listte  yok ise o elemanı silemediğinden size false der
        boolean p=cities.remove("Kayseri");//elemanla  göre
        System.out.println(p);
    }
}
