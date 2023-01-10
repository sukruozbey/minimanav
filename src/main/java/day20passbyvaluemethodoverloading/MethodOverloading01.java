package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {
    /*
    1)Bir method Owerloading yaparken method ismi değiştirilmez
    2)Bir method Owerloading yaparken parametreler değiştirilir
     i)parametre değiştirilirken parametrelerin data typeleri değiştiriliebilir
     ii)parametre değiştirilirken "parametrelerin data typeleri farklı" ise yerleri değiştirilebilir
     iii)parametre değiştirilirken "parametrelerin sayısı"  değiştirilebilir
     3)Java için ismi ve parametreleri aynı olan iki method tamamıyla aynıdır
     Bu yüzden "ismi" ve "parametre" Methodsignature diye adlandırılır
     4)Method Overloading olustururken "return type"'i degistirmenin hicbir etkisi yoktur.
    Method Overloading olustururken "access modifier"'i degistirmenin hicbir etkisi yoktur.
    Method Overloading olustururken method'u "static" ya da "non-static" yapmanin hicbir etkisi yoktur.
    Method Overloading olustururken "method body"'i degistirmenin hicbir etkisi yoktur.
    5)"private" methodlar Owerloadedilebilir
    "private" olmak ise başka class'lara gidildiğinde problem oluşturur
    6)"Static" methodlar overload olabilirler

     */
    public static void main(String[] args) {

        add(3,5);
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b,int c){
        System.out.println(a+b);
    }
}
