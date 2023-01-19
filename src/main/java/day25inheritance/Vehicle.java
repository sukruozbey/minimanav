package day25inheritance;

public class Vehicle {

    /*
 1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
  parent class'dan baslatilarak alta dogru calistirilir.
2)Child Class'daki constructordan Parent Class'daki constructor'a gidebilmek icin "super()" kullanilir
3)Parent Class'da birden fazla constructor varsa istenilen constructor, "super()" ifadesinin parentezi icine yazilan
  parametreler yardimi ile secilebilir.
4)Ayni Class icindeki constructor'lari secmek icin "this()" kullanilir.
 Ayni Class'da birden fazla constructor varsa istenilen constructor, "this()" ifadesinin parentezi icine yazilan
 parametreler yardimi ile secilebilir.
5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
          İnterviev sorusu)
7)Bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6. kural...
8)Inheritance da variablelları ve methodları çağırmak için "this" veya "super" kullanılır
  "this" aynı class içindeki variablelları ve methodları çağırmak için kulanılır
  "super" parent class içindeki variablelları ve methodları çağırmak için kulanılır
9)  Method cagirirken constructora bakilir.
    Methodu'i ararken belirtilen constructordan aramaya baslayip bulanan kadar super'a dogru gideriz.
10) Variable cagirirken data type'a bakilir.
    Variable'i ararken data typedaki classtan aramaya baslayip bulanan kadar super'a dogru gideriz.
11) Inheritance'da Object kullanarak variable cagirirsanizi, Object'in data tipini temsil eden class'dan variable'i
    aramaya baslayiniz. O class da yoksa parent'lara bakiniz
12) Inheritace'da Object kullanarak method cagirirsaniz Object'in constructor'ini temsil eden class'dan methodu aramaya baslayiniz
    o class'da yoksa parent'lara bakiniz.
         */
    public  int price=12000;
    public void engine(){

        System.out.println("Vehicle engine..");
    }
    public Vehicle(){

        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        this();

        System.out.println("Vehicle 2: " + price);
    }

}

