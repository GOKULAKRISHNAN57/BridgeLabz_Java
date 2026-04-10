package core_programming.programming_elements.Level1;

public class Calculate_Discount {

    public static void main(String[] args) {
        //The University is charging the student a fee of INR 125000 for the course.
        // The University is willing to offer a discount of 10%.
        // Write a program to find the discounted amount and discounted price the student will pay for the course.
        //Hint =>
        //Create a variable named fee and assign 125000 to it.
        //Create another variable discountPercent and assign 10 to it.
        //Compute discount and assign it to the discount variable.
        //Compute and print the fee you have to pay by subtracting the discount from the fee.

        final int fee = 125000;
        final int discountPercent = 10;

        final double discount = (discountPercent/100.0) * fee;
        System.out.println(discount);

        final double newFee = fee - discount;

        System.out.println("The new fees after the discount is "+newFee);


    }
}
