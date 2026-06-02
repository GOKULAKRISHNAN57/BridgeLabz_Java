package Collection_Streams_Junit_Regex.Exception.Level2_Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TryWithResourcesProblem1 {

    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            System.out.println("--- Processing: " + path + " ---");
            
            // Try-with-resources handles a single resource automatically closing it
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                // Catches missing files or reading issues per file without crashing the loop
                System.out.println("IOException caught while processing " + path + ": " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        TryWithResourcesProblem1 processor = new TryWithResourcesProblem1();
        List<String> files = Arrays.asList("file1.txt", "file2.txt");
        processor.processFiles(files);
    }
}