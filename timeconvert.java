import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Scanner;
public class timeconvert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time:");
        String t = sc.nextLine();
        sc.close();


        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(t,dt);
        
        int hour = time.getHour();
        int min = time.getMinute();
        int hours;
        if (hour > 12 || hour == 0) {
            if (hour == 0) {
                hours = 12;
            } else {
                hours = hour - 12;
            }
            System.out.println(hours + ":" + min + " PM");
        } else {
            System.out.println(time + " AM");
        
    }
    }}