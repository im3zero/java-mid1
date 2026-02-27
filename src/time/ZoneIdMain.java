package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId+" | "+zoneId.getRules());
        }

        ZoneId zondId = ZoneId.systemDefault();
        System.out.println("ZondId.systemDefault = " + zondId);

        ZoneId seoulzoneId = ZoneId.of("Asia/Seoul");
        System.out.println("SeoulZoneId = " + seoulzoneId);
    }
}
