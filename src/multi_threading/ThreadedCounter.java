package multi_threading;

import java.util.Scanner;

// Thread class responsible for counting a range
class CounterThread extends Thread {

    private int start;   // starting number
    private int end;     // ending number

    // Constructor to initialize range
    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Thread execution logic
    @Override
    public void run() {

        // Loop through assigned range
        for (int i = start; i <= end; i++) {

            // Synchronize output to avoid mixed printing
            synchronized (System.out) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " Count: " + i
                );
            }

            try {
                // Small delay to simulate real threading
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Main class
public class ThreadedCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Take input from user
            System.out.print("Enter counting limit: ");
            int limit = scanner.nextInt();

            // Validate input
            if (limit <= 0) {
                System.out.println("Invalid limit");
                return;
            }

            // Split work between two threads
            int mid = limit / 2;

            CounterThread t1 = new CounterThread(1, mid);
            CounterThread t2 = new CounterThread(mid + 1, limit);

            // Set thread names
            t1.setName("Thread-1");
            t2.setName("Thread-2");

            // Start threads
            t1.start();
            t2.start();

            // Wait for both threads to finish
            t1.join();
            t2.join();

            System.out.println("Counting completed successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}