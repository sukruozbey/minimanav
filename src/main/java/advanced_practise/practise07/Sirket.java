package advanced_practise.practise07;

public class Sirket {
   static int kasa;
    int depButcesi;
    int depKazandigiParaToplami;

    public void kasadanParaAl(int alinacakPara){
        depButcesi+=alinacakPara;
        kasa-=alinacakPara;
        System.out.println("Kasadan "+alinacakPara+"lira alındı");

    }
    public void paraKazan(int kazanilanPara){
        kasa+=kazanilanPara;
        depKazandigiParaToplami+=kazanilanPara;
        System.out.println(kazanilanPara+"lira kazanıldı");
    }
    public static void kasadanHarca(int harcananPara){
        kasa-=harcananPara;
        System.out.println("Kasadan"+harcananPara+"lira harcandı");
    }
    public void departmanHarcamasi(int harcananPara){
        depButcesi-=harcananPara;
        System.out.println("Departman bütçesinden"+harcananPara+"lira harcandı");
    }





}
