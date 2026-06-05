package multi_threading;

import java.util.LinkedList;
import java.util.Queue;

// Shared resource between producer and consumer
class SharedResource {

    private Queue<Integer> queue = new LinkedList<>(); // shared queue
    private final int CAPACITY = 5; // max size of queue

    // Producer adds data to queue
    public synchronized void produce(int task) throws InterruptedException {

        // If queue is full, wait
        while (queue.size() == CAPACITY) {
            wait();
        }

        // Add task to queue
        queue.add(task);

        System.out.println("Produced Task: " + task);

        // Notify consumer that data is available
        notify();
    }

    // Consumer removes data from queue
    public synchronized int consume() throws InterruptedException {

        // If queue is empty, wait
        while (queue.isEmpty()) {
            wait();
        }

        // Remove task from queue
        int task = queue.poll();

        System.out.println("Consumed Task: " + task);

        // Notify producer that space is available
        notify();

        return task;
    }
}

// Producer thread
class Producer extends Thread {

    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        // Produce 10 tasks
        for (int i = 1; i <= 10; i++) {
            try {
                resource.produce(i);
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {

    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        // Consume 10 tasks
        for (int i = 1; i <= 10; i++) {
            try {
                resource.consume();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
    }
}

// Main class
public class ProducerConsumer {

    public static void main(String[] args) {

        // Shared object between threads
        SharedResource resource = new SharedResource();

        // Create producer and consumer
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        // Start threads
        producer.start();
        consumer.start();
    }
}