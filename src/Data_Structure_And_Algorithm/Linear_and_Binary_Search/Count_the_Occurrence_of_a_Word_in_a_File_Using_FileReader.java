package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Count_the_Occurrence_of_a_Word_in_a_File_Using_FileReader {

    public static void main(String[] args) {

        String targetWord = "adventure";
        int count = 0;

        try {
            FileReader fileReader = new FileReader("src/Data_Structure_And_Algorithm/Linear_and_Binary_Search/adventure.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line  = bufferedReader.readLine();

            while (line != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }

                line = bufferedReader.readLine();

            }
            fileReader.close();
            bufferedReader.close();

            System.out.println("The Number of times the word "+targetWord+" appears in the paragraph is "+count);

        }
        catch (FileNotFoundException exception){
            exception.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}
