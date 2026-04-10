package core_programming.Extras_Build_In_Functions;
import java.time.LocalDate;

public class DateCalculator {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2024, 1, 1);
        System.out.println("Initial Date: " + initialDate);

        LocalDate modifiedDate = initialDate.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        LocalDate finalDate = modifiedDate.minusWeeks(3);

        System.out.println("After Adding 7 days, 1 month, 2 years: " + modifiedDate);
        System.out.println("After Subtracting 3 weeks: " + finalDate);
    }
}