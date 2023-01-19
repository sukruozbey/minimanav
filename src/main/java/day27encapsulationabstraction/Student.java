package day27encapsulationabstraction;

public class Student {
    /*
         Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
Bu ise kapsulleme ingilizce ENCAPSULATION denir. Benim ilk aldigim offerda aldigim soru buydu.
What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
offer alirsiniz :)) dedi.
   "private" access yaparak encapsulation yapmis oluruz. Ilanin disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
Simdi size dicekler ki encapsulation nedir. Data Hiding. Data nasil saklanir. Access Modifier private yapariz. diyeceksiniz, dedi.
        */
    //Encapsulation : Data hiding demektir.Datayı saklamak demektir.
    private String stdId="AC123";
    private double gpa=3.99;
    private boolean poor=true;

    //Encapsulation yapilmis datayi okuyabilirmiyiz?
    //get Methodlar (getter)encapsule edilmiş(saklanmış) datayı okumamıza yarar
    //get Methodlar (getter) her zaman "public"olur.
    //get Methodlar (getter) return type 'i variable'ın data type ile aynı olur.
    //get Methodlar (getter) isimleri get+variable name şeklinde olur.
    //get Methodlar (getter) isimleri variable boolean ise is+variablename şeklinde olur.
    //get Methodlar (getter) parametre kullanmazlar.


    public String getStdId() {
        return stdId;
    }

    public double getGpa() {

        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }
//Encapsulation yapılmış dataların değeri değiştirilebililr mi
    //set methodlar (setter) encapsule edilmiş dataların değerlerini değiştirmemize yarar.
    //set Methodlar (setter) her zaman "public"olur.
    //set Methodlar (setter) return type i her zaman void olur
    //set Methodlar (setter) isimleri set+variable name şeklinde olur.
    //set Methodlar (setter) variable ile aynı data tipinde parametre kullanırlar.
    //getter ve setter ın ikisine birden "java beans "denir


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {

        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
