package day28exceptions;

public class Exception05 {
    public static void main(String[] args) {
        int a=16;
        int b=2;
        String s="My Java";
        getCharFromString(s,a,b);
    }
    //try kısmında birden fazla Exception oluşturma ihtimalı olan kod varsa çoklu "catch" kullanabilirsiniz
    //Çoklu catch kullandığınızda parent child ilişkisi yoksa ,catchlerin sırası önemli değildir.
    //ama koddaki sıraya uymak tavsiye edilir
    //Çoklu catch kullandığınızda parent child ilişkisi varsa  ,catchlerin sırası önemlidir.
    //Child olan class üstte olmalıdır

    //Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
//icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)
//Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
    public static void getCharFromString(String s,int a,int b){
        try {
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);

        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullanıdınız");
        }

    }
}
