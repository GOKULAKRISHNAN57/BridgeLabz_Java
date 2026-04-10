package core_programming.programming_elements.Level2;
import java.util.Scanner;

public class Perimeter_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side3: ");
        double s3 = sc.nextDouble();

        double perimeter = s1 + s2 + s3;
        double rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds);
    }
}
