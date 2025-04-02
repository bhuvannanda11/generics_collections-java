package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class fileProcessorTest {
    private static final String TEST_FILE = "test.txt";
    private fileProcessor fileProcessor = new fileProcessor();

    @AfterEach
    void cleanUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }

    @Test
    void testWriteAndRead() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Hello");
        assertEquals("Hello", fileProcessor.readFromFile(TEST_FILE));
    }

    @Test
    void testFileExists() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Test");
        assertTrue(Files.exists(Path.of(TEST_FILE)));
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nofile.txt"));
    }

}