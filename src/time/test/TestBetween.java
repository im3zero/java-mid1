package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        Period dday = Period.between(startDate, endDate);
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("남은 기간: " + dday.getYears() + "년 " + dday.getMonths() + "개월 " + dday.getDays()+ "일" );
        System.out.println("디데이 : " + daysBetween + "일 남음");

    }
}
