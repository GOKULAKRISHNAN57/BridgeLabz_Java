package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Read_a_File_Line_by_Line_Using_FileReader {

    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader("src/Data_Structure_And_Algorithm/Linear_and_Binary_Search/luffy.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            fileReader.close();
            bufferedReader.close();


        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}
