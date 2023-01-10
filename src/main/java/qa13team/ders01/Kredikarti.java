package qa13team.ders01;

import java.util.Scanner;

public class Kredikarti {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);
        System.out.println("Isim Soyisminizi ve Kredi Karti Numaranizi giriniz...");
        String nameCc = input.nextLine().replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim().toLowerCase();

        String name1 = nameCc.toUpperCase().split(" ")[0];
        String name2 = nameCc.toUpperCase().split(" ")[1];
        String ccNum = nameCc.toUpperCase().split(" ")[2];
        String name1Star = name1.substring(0, 1) + name1.substring(1).replaceAll("[\\w]", "*");
        String name2Star = name2.substring(0, 1) + name2.substring(1).replaceAll("[\\w]", "*");


        if (ccNum.length() != 16) {
            System.out.println("Lutfen Kredi Karti Numaranizi 16 hane olarak giriniz...");
        } else {
            String ccLastFour = ccNum.substring(12);
            System.out.println("Name : " + name1Star + " " + name2Star);
            System.out.println("CCN  : **** **** **** " + ccLastFour);

        }
        Scanner inputt = new Scanner(System.in);
        System.out.println("Lütfen isim, soyisim ve kart numaranızı giriniz...");
        String user = inputt.nextLine().trim().replaceAll("\\s+", " ");

        String name = "";
        for (int i = 0; i < user.split(" ")[0].length(); i++) {
            if (i == 0) {
                name += user.split(" ")[0].toUpperCase().charAt(0);
            } else {
                name += '*';
            }
        }

        String surname = "";

        for (int i = 0; i < user.split(" ")[1].length(); i++) {
            if (i == 0) {
                surname += user.split(" ")[1].toUpperCase().charAt(i);
            } else {
                surname += "*";
            }
        }

        System.out.println("Name: " + name + " " + surname);

        String validCreditCard = " ";

        String creditCardNumber = user.split(" ")[2];
        if (creditCardNumber.length() != 16) {
            System.out.println("Invalid credit card number");
        } else {
            validCreditCard = "";
            for (int i = 0; i < creditCardNumber.length(); i++) {
                if ((i < 19) && (i == 4 || i == 9 || i == 14)) {
                    validCreditCard += " ";
                } else if (i < 15) {
                    validCreditCard += '*';
                } else {
                    validCreditCard += creditCardNumber.substring(12, 16);
                }
            }
            System.out.println("CCN :" + validCreditCard);


        }

        */


        Scanner input = new Scanner(System.in);
        System.out.println("Isim Soyisminizi ve Kredi Karti Numaranizi giriniz...");
        String nameCc = input.nextLine().replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim().toLowerCase();

        String name1 = nameCc.toUpperCase().split(" ")[0];
        String name2 = nameCc.toUpperCase().split(" ")[1];
        String ccNum = nameCc.toUpperCase().split(" ")[2];
        String name1Star = name1.substring(0, 1) + name1.substring(1).replaceAll("[\\w]", "*");
        String name2Star = name2.substring(0, 1) + name2.substring(1).replaceAll("[\\w]", "*");


        if (ccNum.length() != 16) {
            System.out.println("Lutfen Kredi Karti Numaranizi 16 hane olarak giriniz...");
        } else {
            String ccLastFour = ccNum.substring(12);
            System.out.println("Name : " + name1Star + " " + name2Star);
            System.out.println("CCN  : **** **** **** " + ccLastFour);

        }
    }
}
