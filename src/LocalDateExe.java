import java.time.LocalDate;

public class LocalDateExe {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("\nprint the day of the month of the default system");
        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);

        System.out.println("\nprint the value of the month");
        int monthvalue = date.getMonthValue();
        System.out.println(monthvalue);

        System.out.println("\nprint the year");
        int year = date.getYear();
        System.out.println(year);


        System.out.printf("%d-%d-%d", dayOfMonth, monthvalue, year);
    }
}
