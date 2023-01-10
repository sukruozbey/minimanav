package qa13team.ders02;

import java.util.Arrays;

public class Kacıncıarray {
    public static void main(String[] args) {
        // Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        //Array: [12,15,43,23,56,76,78,90,77,43]
        //Aranan değer:56 */
        int []arr={12,15,43,23,56,76,78,90,77,43};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int counter=0;
        for (int i=0;i< arr.length;i++){
            counter++;
            if(arr[i]==56){
                break;

            }

        }
        System.out.println("Baştan  " + counter+".cı elemandır");


    }
}
