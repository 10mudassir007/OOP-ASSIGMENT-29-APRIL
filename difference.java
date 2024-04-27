import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class difference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date 1 in YYYY-MM-DD format:");
        String d1 = sc.nextLine();
        System.out.println("Enter date 2 in YYYY-MM-DD format:");
        String d2 = sc.nextLine();
        sc.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(d1,formatter);
        LocalDate date2 = LocalDate.parse(d2,formatter);
        
        Period diff = Period.between(date1, date2);
        
        int years = diff.getYears();
        int months = diff.getMonths();
        int days = diff.getDays();

        if (years > 0) {
            days += (years * 365);
        }
        if (months > 0) {
            days += (months * 30);
        }
        System.out.println("Difference between: "+days+" days");
    }
}