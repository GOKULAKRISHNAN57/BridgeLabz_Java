package core_programming.Extras_Build_In_Functions;
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.next());

        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.next());

        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before Date 2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is after Date 2");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same");
        }

        scanner.close();
    }
}