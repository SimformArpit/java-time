import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeroidDateTime {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(2001 ,9,06);
        LocalDate todaysDate = LocalDate.now();
        Period p = Period.between(birthdate,todaysDate);
        System.out.printf("your age is %d:Years %d:Months %d:Days" ,p.getYears() ,p.getMonths(),p.getDays());
    }
}
