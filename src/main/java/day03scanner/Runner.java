package day03scanner;

public class Runner {
    public static void main(String[] args) {
        //Object nasil olusturulur?
        //Class Ismi    Object Ismi   Atama Operatoru    "new" keyword     Constructor
        Car           myCar             =               new             Car();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        myCar.hareket();
        myCar.dur();
        System.out.println(myCar.konfor);


        Student tomHanks = new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.address);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.age);
        tomHanks.study();
        tomHanks.feed();

        Omer mySon=new Omer();
        System.out.println(mySon.adres);
        System.out.println(mySon.age);
        System.out.println(mySon.name);
        mySon.ders();

        Akıf mySon2=new Akıf();
        System.out.println(mySon2.name);
        System.out.println(mySon2.sev);
        System.out.println(mySon2.yas);
    }
}
