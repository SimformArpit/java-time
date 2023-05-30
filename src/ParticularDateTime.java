import java.time.LocalDateTime;

public class ParticularDateTime {
    public static void main(String[] args) {
        LocalDateTime birthDay = LocalDateTime.of(2001, 9, 06, 12, 59);
        System.out.println("Birthdate : " + birthDay);
        System.out.println("Before six Day of the Birthdate  : " + birthDay.plusDays(6));
        System.out.println("After six Day  of the Birthdate  : " + birthDay.minusDays(6));
        System.out.println("Before six month Date of the Birthdate : " + birthDay.minusMonths(6));
        System.out.println("After six month Date of the Birthdate  : " + birthDay.plusMonths(6));
    }
}
