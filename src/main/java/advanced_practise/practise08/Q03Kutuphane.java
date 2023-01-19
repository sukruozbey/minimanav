package advanced_practise.practise08;

public class Q03Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı,
    // seri numarası ile yazdıran bir kod yazınız.
    public static void main(String[] args) {
        Kutuphane obj1 = new Kutuphane("Mağaradakiler","Cemil Meriç", 285);

        Kutuphane obj2 = new Kutuphane("Kırlangıç Çığlığı", "Ahmet Ümit",400);
        obj2.sayfaSayisi=405;

    }


}
