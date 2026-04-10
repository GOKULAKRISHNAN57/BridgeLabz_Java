package core_programming.programming_elements.Level1;

public class Average_Mark_Percentage {
    public static void main(String[] args) {

        int samMarkInMaths = 94;
        int samMarkInPhysics = 95;
        int samMarkInChemistry = 100;

        double averagePercentage = (samMarkInMaths + samMarkInPhysics + samMarkInChemistry) / 300.0  * 100.0;

        System.out.println("Sam’s average percentage mark in PCM is " + averagePercentage+"%");


    }
}
