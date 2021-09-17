package day20.api.time;

import java.time.*;

public class Basic {

    public static void main(String[] args) {

        //현재날짜정보 얻기
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        //특정 날짜정보를 생성
        LocalDate targetDate = LocalDate.of(2022, 5, 21);
        System.out.println("targetDate = " + targetDate);

        //현재 시간정보 얻기
        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);

        //현재 날짜와 시간정보 얻기
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        int year = dateTime.getYear();
        System.out.println("year = " + year);
        Month month = dateTime.getMonth();
        System.out.println("month = " + month);

        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);


    }
}
