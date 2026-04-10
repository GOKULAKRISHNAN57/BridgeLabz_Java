package core_programming.programming_elements.Level1;

public class Finding_Remaining_Pens_After_Equal_Distribution {

    public static void main(String[] args) {

        int numberOfPens = 14;
        int students = 3;

        int distributedPens = numberOfPens / students;
        int nonDistributrdPens = numberOfPens % students;

        System.out.println("The Pen Per Student is "+distributedPens+" and the remaining pen not distributed is "+nonDistributrdPens);
    }
}
