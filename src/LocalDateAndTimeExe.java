import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAndTimeExe {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.toLocalDate());
        System.out.println(dateTime.toLocalTime());
        System.out.println("Month: " + dateTime.toLocalDate().getMonthValue() + " Date: " + dateTime.toLocalDate().getDayOfMonth() + " Year: " + dateTime.toLocalDate().getYear());
        System.out.println("Hours: " + dateTime.toLocalTime().getHour() + " Minutes: " + dateTime.toLocalTime().getMinute() + " Seconds: " + dateTime.toLocalTime().getSecond() + " NanoSecond: " + dateTime.toLocalTime().getNano());



//        System.out.println(dateTime.atZone());
    }
}
