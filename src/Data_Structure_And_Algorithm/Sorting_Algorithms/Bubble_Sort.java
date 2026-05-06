package Data_Structure_And_Algorithm.Sorting_Algorithms;

//bubble sort
//ascending order
public class Bubble_Sort {
    public static void main(String[] args) {

        //marks for students
        int[] marks = {74,97,82,69,84,57,87,77};

        //outer loop
        for(int i = 0; i < marks.length; i++){

            int j1 = 0;
            int j2 = 1;

            //inner while loop
            //we take the largest element and move it over to the end
            while (true){

                if(j2 == marks.length) break;

                if(marks[j1] >= marks[j2]){
                    int temp = marks[j1];
                    marks[j1] = marks[j2];
                    marks[j2] = temp;
                }

                j1++;
                j2++;
            }
        }

        //printing the sorted array
        for(int mark : marks){
            System.out.print(mark+" ");
        }
    }
}
