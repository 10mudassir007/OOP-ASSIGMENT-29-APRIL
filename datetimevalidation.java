import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class datetimevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date current_date = new Date();

        System.out.println("Enter date of future in yyyy-mm-dd hh:mm:ss");
        String date = sc.nextLine();

        sc.close();
            
        try {
            Date dateTime = format.parse(date);

            if (dateTime.after(current_date)) {
                System.out.println("The date/time is in the future ");
            }
            else {
                System.out.print("Invalid: Date must be in the future");
            }}
        catch (ParseException e) {
            System.out.println("Invalid Date/Time Format");
        }
        }
    }
