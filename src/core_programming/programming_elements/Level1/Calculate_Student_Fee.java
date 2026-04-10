package core_programming.programming_elements.Level1;

import java.util.Scanner;

public class Calculate_Student_Fee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}
