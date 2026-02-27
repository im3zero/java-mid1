package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);

        }

        System.out.println("\nHOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.getDuration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS = " + ChronoUnit.DAYS);
        System.out.println("DAYS.Duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime lt1 = LocalTime.of(1, 10, 10);
        LocalTime lt2 = LocalTime.of(1, 20, 10);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);

        System.out.println("secondsBetween = " + secondsBetween);
        System.out.println("minutesBetween = " + minutesBetween);

    }
}
