package core_programming.control_flow.Level_1;
import java.util.Scanner;

public class Find_bonus_of_employees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
