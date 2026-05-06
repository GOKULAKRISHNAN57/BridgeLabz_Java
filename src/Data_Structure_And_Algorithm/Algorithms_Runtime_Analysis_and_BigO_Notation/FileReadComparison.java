package Data_Structure_And_Algorithm.Algorithms_Runtime_Analysis_and_BigO_Notation;

import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        String path = "largefile.txt";

        long start = System.nanoTime();

        FileReader fr = new FileReader(path);
        while (fr.read() != -1) {}
        fr.close();

        long end = System.nanoTime();
        System.out.println("FileReader: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();

        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(path));

        while (isr.read() != -1) {}
        isr.close();

        end = System.nanoTime();
        System.out.println("InputStreamReader: " + (end - start) / 1e6 + " ms");
    }
}