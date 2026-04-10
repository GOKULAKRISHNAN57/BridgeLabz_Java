package core_programming.programming_elements.Level2;
import java.util.Scanner;

public class Distance_Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("To City: ");
        String toCity = sc.nextLine();

        System.out.print("Distance From-To Via (miles): ");
        double d1 = sc.nextDouble();

        System.out.print("Distance Via-To Final (miles): ");
        double d2 = sc.nextDouble();

        System.out.print("Time taken (hours): ");
        double time = sc.nextDouble();

        double totalDistance = d1 + d2;

        System.out.println(name + " travels from " + fromCity + " to " + toCity + " via " + viaCity);
        System.out.println("Total Distance: " + totalDistance + " miles in " + time + " hours");
    }
}