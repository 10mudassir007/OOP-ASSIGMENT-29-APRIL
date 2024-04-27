import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class reminder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date and time in YYYY-MM-DD HH:MM:SS format:");
        String date = sc.nextLine();
        
        System.out.println("Enter message to print:");
        String message = sc.nextLine();
        sc.close();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
        Date reminderDate = format.parse(date);

        Timer timer = new Timer(); 

        timer.schedule(new ReminderTask(message),reminderDate);
        System.out.println("Reminder scheduled successfully.");
        } catch (ParseException e) {
            System.out.println("Error: Wrong format");
        }   
        }


    static class ReminderTask extends TimerTask {
        private String message;

        public ReminderTask(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println("Reminder: "+message);
        }
}}