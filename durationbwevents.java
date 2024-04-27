import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
public class durationbwevents {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start date in YYYY-MM-DD HH:mm:ss format:");
        String d1 = sc.nextLine();
        System.out.println("Enter end date in YYYY-MM-DD HH:mm:ss format:");
        String d2 = sc.nextLine();
        sc.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date1 = LocalDateTime.parse(d1,formatter);
        LocalDateTime date2 = LocalDateTime.parse(d2,formatter);
        
        Duration duration = Duration.between(date1, date2);

        long hours = duration.toHours();
        long mins = duration.toMinutesPart();
        long sec = duration.toSecondsPart();
        
        System.out.println("Duration of event: "+hours+" Hours "+mins+" Minutes "+sec+ " Second ");
    }
}