package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class longRunningTaskTest {
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS) // Fails if execution time exceeds 2 seconds
    void testLongRunningTaskTimeout() {
        longRunningTask task = new longRunningTask();
        longRunningTask.longRunningTask(); // This should fail since it takes 3 seconds
    }

}