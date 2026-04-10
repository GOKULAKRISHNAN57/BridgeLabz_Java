package core_programming.programming_elements.Level1;

public class Profit_and_Loss {
    public static void main(String[] args) {

        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = ((double) profit / (double) costPrice) * 100;

        System.out.println("The Cost Price is INR" + costPrice +" and Selling Price is INR " + sellingPrice+
                           "\nThe Profit is INR "+ profit +" and the Profit Percentage is "+profitPercentage);
    }
}
