import java.time.LocalDateTime;
import java.time.Duration;

public class Time {

    private static final LocalDateTime START = LocalDateTime.now();
    private static final LocalDateTime FINISH = LocalDateTime.parse("2022-09-21T00:00:00"); // It is necessary to set a date with which time will be counted

    public static void main(String[] args) {

        Duration between = Duration.between(START, FINISH).abs();
        System.out.println("Passed " + between.getSeconds() + " seconds");

    }
}
