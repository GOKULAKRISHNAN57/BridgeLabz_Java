package Data_Structure_And_Algorithm.Sorting_Algorithms;

public class Selection_Sort {

    //Selection Sort
    //ascending order
    public static void main(String[] args) {

        //marks for students
        int[] marks = {74,97,77,82,69,84,57,87,77};

        int smallest = Integer.MAX_VALUE;
        int marker = -1;

        //outer loop
        for (int i = 0; i < marks.length; i++) {

            //inner loop
            for (int j = i; j < marks.length; j++) {

                if(smallest >= marks[j]){
                    smallest = marks[j];
                    marker = j;
                }
            }

            marks[marker] = marks[i];
            marks[i] = smallest;
            smallest = Integer.MAX_VALUE;

        }

        //printing the sorted array
        for (int mark : marks) {
            System.out.print(mark+" ");
        }

    }
}
