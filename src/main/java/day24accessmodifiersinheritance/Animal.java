package day24accessmodifiersinheritance;

public class Animal {
    /*
    Inheritance ingilizcede miras demektir.childlar parentten yararlanıyor
    Inheritance'in faydalari;
    1) Code standardında tekrar iyi değildir.
    2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
    3) Gelişime update'e açık olmalıdır
    4) Code atomic yapıda olmalı.

Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)

Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız

Not  3:"public" methodlar child classlar tarafından kullanılabilir.
        "child classlar tarafından kullanılabilir demek""inherit edilebilir" demektir

Not  4:"protected" methodlar "inherit edilebilir"
                Çünkü "protected" olan method ve variablelar child tar.kullanılabilir

Note 5: "default" method'lar object ile ayni package'de olduklari surece "inherit" edilebilirler.
            Ama default method ile object'in uretildigi class farkli package'lerde ise "inherit" edilemezler.

note 6:   "private" methodlar inherit edilemezler.

Note 7: Java birden fazla parent'i(multiple inheritance Java tarafindan desteklenmez) onaylamaz
Note 8: Child --> Parent --> Grand Parent --> Grand Grand Parent ... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.
Note 9: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
Note 10: Java'da Object Class haric tum class'larin parent'i vardir.
Note 11: Java'da "parenttan" "child" aolan ilişkilere "HAS-A Reltionship" denir.
         Java'da "child dan" "parentta" olan ilişkilere "IS-A Reltionship" denir.
Note 12: Java'da her class'in bir tane default constructor'i vardir.
                 Bu default constructor class'in icinde gorunmez cunku default constructor "Object Class" icindedir.
                 Bizim class'imiz default constructor'a ihtiyac duydugunda parent olan  "Object Class" a gider ve oradaki constructor'i kullanir.


  */

    public void eat(){
        System.out.println("Animals eat");
    }

     void drink(){
        System.out.println("Animals eat");
    }

}
