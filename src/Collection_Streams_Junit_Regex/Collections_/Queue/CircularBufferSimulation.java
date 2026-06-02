package Collection_Streams_Junit_Regex.Collections_.Queue;

public class CircularBufferSimulation {

    private int[] buffer;
    private int size;
    private int front;
    private int rear;
    private int count;

    public CircularBufferSimulation(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void add(int value) {

        if (count == size) {
            buffer[rear] = value;
            rear = (rear + 1) % size;
            front = (front + 1) % size;
        } else {
            buffer[rear] = value;
            rear = (rear + 1) % size;
            count++;
        }
    }

    public void display() {

        for (int i = 0; i < count; i++) {
            int index = (front + i) % size;
            System.out.print(buffer[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularBufferSimulation cb = new CircularBufferSimulation(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.display();

        cb.add(4);
        cb.display();
    }
}