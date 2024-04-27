import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class dateparse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in YYYY-MM-DD format:");
        String d1 = sc.nextLine();
        sc.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDateTime date1 = LocalDateTime.parse(d1,formatter);
            System.out.println("Parsed Date "+date1);
        }
        catch (DateTimeParseException e) {
            System.out.println("Error: Invalid Format");
        }
    }
}