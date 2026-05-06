package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Convert_Byte_Stream_to_CharacterStream_Using_InputStreamReader {

    public static void main(String[] args) {
        String path = "src/Data_Structure_And_Algorithm/Linear_and_Binary_Search/binaryformat.txt";

        // Try-with-resources automatically closes all streams in the parentheses
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)) {

            String line;
            // Shorthand loop: assignment and null-check in one line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("The file could not be found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
