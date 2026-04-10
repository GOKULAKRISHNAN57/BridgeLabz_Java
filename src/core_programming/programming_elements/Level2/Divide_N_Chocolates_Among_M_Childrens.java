package core_programming.programming_elements.Level2;
import java.util.Scanner;

public class Divide_N_Chocolates_Among_M_Childrens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int each = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child gets " + each + " chocolates and remaining chocolates are " + remaining);
    }
}