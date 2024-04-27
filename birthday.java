import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class birthday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in YYYY-MM-DD format:");
        String d1 = sc.nextLine();
        sc.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(d1,formatter);
        LocalDate date2 = LocalDate.now();

        Period diff = Period.between(date1, date2);
        
        int years = diff.getYears();
        int months = diff.getMonths();
        int days = diff.getDays();
        System.out.println("Age: "+years+" years "+months+" months "+days+" days");
    }
}