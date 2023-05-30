import java.time.Year;
import java.util.Scanner;

public class YearExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
     while (flag){
          System.out.println("1 : to see check weather year is leap year or not again ");
          System.out.println("2 : to close ");

          int inp = sc.nextInt();
         switch (inp) {
             case 1 -> {
                 System.out.println("Enter your year ");
                 int n = sc.nextInt();
                 Year year = Year.of(n);
                 if (year.isLeap()) {
                     System.out.printf("%d is a leap year\n", n);
                 } else {
                     System.out.printf("%d is a not a leap year\n", n);
                 }
             }
             case 2 -> {
                 flag = false;
                 System.out.println("Bye Bye");
             }
         }
      }
    }
}
