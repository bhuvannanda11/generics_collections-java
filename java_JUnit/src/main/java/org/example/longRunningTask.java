package org.example;
import java.util.*;

public class longRunningTask {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a long-running task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }

}
