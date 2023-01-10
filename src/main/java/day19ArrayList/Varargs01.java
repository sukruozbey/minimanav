package day19ArrayList;

public class Varargs01 {
    public static void main(String[] args) {
        /*
        Varargslar  bize parametre sayısında esneklik verir
        Method'un parantezleri icine yazilanlara "parametre" denir
        Method'u cagirirken kullanilan sayilara da "argument" denir.


        Note:Bir methotta 1den fazla Varargs kullanılamaz çünkü ikincisi "unreachable "olur
        Note:Varargs ,Varargs dışındaki parametrelerle kullanılabilir ama Varargs her zaman" son parametre" olmalıdır
         */
        addTwoNumbers(3, 5);

        addThreeNumbers(4, 7, 2);

        add(4, 5, 6, 7, 8, 9,100);

    }

    //Iki sayiyi toplayan method olusturunuz
    public static void addTwoNumbers(int a, int b){
        System.out.println(a+b);
    }

    //Uc sayiyi toplayan method olusturunuz
    public static void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
    public static void add(int... a){

        int sum = 0;

        for(int w : a){
            sum = sum + w;
        }

        System.out.println(sum);

    }

}
