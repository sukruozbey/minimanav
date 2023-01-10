package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {
//Example 2: Bir tane integer multidimensional array olusturunuz
//Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int a[][] = {{2, 62, 82}, {3, 13,}};

        int s=0;
        for (int [] w:a){
            for (int k:w){
               s+=k;
            }
        }

        System.out.println(s);

    }

}
