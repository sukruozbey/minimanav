package day11forloop;

public class Forloop04 {
    public static void main(String[] args) {
// BU SORU ÇOK ÖNEMLİ İYİ ANLAMALI

        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26
        int sum = 0;

        for(int i=5; i<9; i++){
            sum = sum + i;
        }
        System.out.println(sum);// 26

        //Example 2: 7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //           7*8*9 ==> 504
        int multiply = 1;
        for (int i =7; i<9; i++){
            multiply=i*multiply;
        }
        System.out.println(multiply);



    }
}
