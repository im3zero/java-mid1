package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDT = LocalDateTime.now();
        LocalDateTime ofDT = LocalDateTime.of(2016, 12, 31, 23, 59, 59);
        System.out.println("현재 날짜시간 = " + nowDT);
        System.out.println("지정 날짜시간 = " +  ofDT);

        //날짜와 시간 분리
        LocalDate localdate = ofDT.toLocalDate();
        LocalTime localTime = ofDT.toLocalTime();
        System.out.println("\nlocaldate = " + localdate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localdate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime ofDTPlus = ofDT.plusDays(1000);
        System.out.println("\n지정 날짜시간 + 1000d = "+ ofDTPlus);
        LocalDateTime ofDTPlusPlus = ofDTPlus.plusYears(1);
        System.out.println("지정 날짜시간 + 1년 = "+ ofDTPlusPlus);


        //비교
        System.out.println("\n현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDT.isBefore(ofDT));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDT.isAfter(ofDT));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? " + nowDT.equals(ofDT));

    }
}
