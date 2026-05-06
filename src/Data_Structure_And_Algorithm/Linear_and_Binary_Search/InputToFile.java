package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

import java.io.*;

public class InputToFile {
    public static void main(String[] args) {
        try {
            // Step 1: Read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Step 2: Write to file
            FileWriter fw = new FileWriter("output.txt");

            String line;

            System.out.println("Enter text (type 'exit' to stop):");

            // Step 3: Loop until user types "exit"
            while (true) {
                line = br.readLine();

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(line + "\n"); // write line to file
            }

            // Step 4: Close resources
            fw.close();
            br.close();

            System.out.println("Data written to file successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}