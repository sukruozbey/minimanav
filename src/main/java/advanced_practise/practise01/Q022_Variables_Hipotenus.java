package advanced_practise.practise01;

import java.util.Scanner;

public class Q022_Variables_Hipotenus {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen 1. dik keanr sayısı gir" );
        double a =input.nextDouble();
        System.out.println("lütfen 2. dik keanr sayısı gir" );
        double b =input.nextDouble();

        double c=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenus:"+c);
        System.out.printf("%.2f",c);



    }
}
