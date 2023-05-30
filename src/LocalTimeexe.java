import java.time.LocalTime;

public class LocalTimeexe {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Time : " + time);
        int hour = time.getHour();
        System.out.println("Hour : " + hour);
        int minute = time.getMinute();
        System.out.println("Minute : " + minute);
        int second = time.getSecond();
        System.out.println("Second : " + second);
        int nanoSecond = time.getNano();
        System.out.printf("%d:%d:%d:%d" ,hour,minute,second,nanoSecond);



    }
}
