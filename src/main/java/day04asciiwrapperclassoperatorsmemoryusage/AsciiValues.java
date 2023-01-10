package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {
    //Java da her karakterin sayisal bir degeri vardir.
    //Bu degerler ASCII Deger'ler olarak adlandirilir.
    //Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir.

    public static void main(String[] args) {

        //Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type'inda bir variable'in icine koyunuz.
        int ch = 'A';
        System.out.println(ch);
        int parantez='(';
        System.out.println(parantez);

        int unlem = '!';
        System.out.println(unlem);
        int s='S';
        System.out.println(s);

        char c1 = 'K';
        char c2 = '?';
        char c3='I';
        //Java'da char'lari matematiksel islemlerde kullanirsaniz, Java o char'larin ASCII degerlerini kullanir.
        System.out.println( c1 + c2+ c3);// 138
        int S='S';
        System.out.println("S = " + S);

    }
    }

