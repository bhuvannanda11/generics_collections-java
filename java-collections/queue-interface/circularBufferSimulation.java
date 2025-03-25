import java.util.*;
public class circularBufferSimulation {
    private int[] buffer;
    private int size;
    private int front, rear;
    private boolean isFull;

    public circularBufferSimulation(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        front = 0;
        rear = 0;
        isFull = false;
    }

    // Insert element into the circular buffer
    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;

        if (isFull) {
            front = (front + 1) % size; // Move front forward when full
        }

        if (rear == front) {
            isFull = true; // Mark buffer as full
        }
    }


    public void display() {
        if (!isFull && front == rear) {
            System.out.println("Buffer is empty.");
            return;
        }

        System.out.print("Buffer: [");
        int i = front;
        while (true) {
            System.out.print(buffer[i]);
            i = (i + 1) % size;
            if (i == rear && !isFull) break; // Stop when we reach the last inserted element
            if (i == front && isFull) break; // Stop when we've wrapped around
            System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        circularBufferSimulation cb = new circularBufferSimulation(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();

        cb.insert(5);
        cb.display();

        cb.insert(6);
        cb.display();
    }
}