package day19ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {
    public static void main(String[] args) {
        /*
    Rastgele kullanici adi olusturan JAVA kodu yaziniz.
       1. Kullanicidan ismini isteyelim
       2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
       3. Kullanici adinin alinabilir olup olmadigina bakalim.
       4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
 */
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz");
        String usarname=input.nextLine().toUpperCase().trim();

       int random= (int)(Math.random()*100);
       while (databaseIsim.contains(usarname+random)){
           random=(int)(Math.random()*100);
       }
        if (databaseIsim.contains(usarname)){
            System.out.println("Bu usarname databasede var tekrar kullanılamaz");
            databaseIsim.add(usarname+random);

        }else{
            System.out.println("Bu usarname kullanılabilir");
            databaseIsim.add(usarname);
        }
        System.out.println(databaseIsim);
    }
}
