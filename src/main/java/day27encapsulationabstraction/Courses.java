package day27encapsulationabstraction;

public abstract class Courses {
    /*
    1)Bazen method body'sini yazmak gerekmez,bu durumlarda bodysiz method oluşturmak gerekir.
    Body'si olmayan methodlara "abstract method" denir

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
    Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.

     5)"abstract classlar"da hem "abstract cmethodlar" hem de "concrete methodlar kullanılabilir.

     6)"concrete classlar abstract class ların chid ı olabilirler.
     "abstract cmethodlar"ın override edilme zorunluluğu "concrete classlar içindir

     */
    public abstract void math();
    public void art (){
        System.out.println("Painting...");

    }
    //final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
    //Bu celiskidir bu yuzden Java abstract method'larin final olmasina musaade etmez.
    //public final abstract void science();
    // Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
    // Ama "Abstract Class" lar icin Child Class olmalidir,cunku Child Class'lar abstract parent classs'daki abstract method'lari kullanirlar.
    //Bu yuzden Java "Abstract Class"larin "final " olmasina musaade etmez.
    //"abstract method" lar "private" olamazlar cunku Child class'lar "abstract method"lari kullanirlar, private yapinca kullanima kapali olur.
    //Bu celiskidir bu yuzden Java "abstract method"larin "private" olmasina musaade etmez.
    //"abstract method" lar "static" olamazlar, cunku static method'lar override edilemez, halbuki abstract method'lar override edilmek icin olusturulmustur.



}
