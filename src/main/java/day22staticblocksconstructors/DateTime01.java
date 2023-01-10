package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println(myDate);// Sat Jan 07 23:31:06 EET 2023
        System.out.println(myDate.getTime()); // 1673123466361 ==> 1 OCAK 1970 den su ana kadar ki milli saniye miktari

        //Icinde bulundugumuz an nasıl alinir ?

        System.out.println(LocalDate.now());//2023-01-07

        System.out.println(LocalTime.now());//23:34:32.071182300

        System.out.println(LocalDateTime.now());//2023-01-07T23:36:02.943463200

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna"))); //2023-01-07T21:46:03.823077500
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-08T05:46:03.824073500
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-07T23:46:03.824073500

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35)); //2030-07-12

        //Geriki bir tarihe nasil gidertiz?

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)) ;//2018-10-05

        //Ileriki bir zamana nasil gidilir ?
        System.out.println(LocalTime.now().plusHours(3)); //02:56:25.564030700

        //Geriki bir zamana nasil gidertiz?
        System.out.println(LocalTime.now().minusMinutes(45)); //23:13:17.952923300

        //Zaman'da belli bir bölümü nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:2

        //Tarih'de belli bir bölümü nasil aliriz ?
        System.out.println(LocalDate.now().getMonth() +" : "+ LocalDate.now().getDayOfMonth());//JANUARY : 8

        //İki tarih nasıl karşılaştırılır?
        //02/13/2005-03/01/2007
       boolean result= LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println("result = " + result);
        //Tarih2lerin formatları nasıl değiştirilir
        // M--> Tek arakamla ay nosu yazar - MM--> Ikı rakamla ay nosunu yazar-MMM-->Ay ismini ilk uc ısmını yazar
        //MMMM--> ay ısımının tamamını yazar.

        //d--> Tek rakamla gün nosunu yazar  -- dd--> Iki rakamla gun nosunu yazar
        //yy--> Yilin son iki rakamini yazar-- yyyy Yilin tamamini yazar
        DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter dtf3 =  DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        DateTimeFormatter dtf4 =  DateTimeFormatter.ofPattern("dd/M/yyyy");

        System.out.println(dtf1.format(LocalDate.now())); //08/01/2023
        System.out.println(dtf2.format(LocalDate.now())); //08/Jan/2023
        System.out.println(dtf3.format(LocalDate.now())); //08/January/2023
        System.out.println(dtf4.format(LocalDate.now())); //08/1/2023
    }
}
