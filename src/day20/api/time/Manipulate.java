package day20.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Manipulate {

    public static void main(String[] args) {

        LocalDate orderDate = LocalDate.now();
        LocalDate takeDate = orderDate.plusDays(15);

        System.out.println("수령예상일: " + takeDate);

        LocalDateTime time = LocalDateTime.now().plusYears(1).plusMonths(10).plusDays(3).plusHours(10);
        System.out.println("time = " + time);


    }

}
