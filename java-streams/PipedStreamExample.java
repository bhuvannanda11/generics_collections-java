import java.io.*;

public class PipedStreamExample {
    public static void main(String[] args) {
        // Create piped streams
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();

        try {
            // Connect the piped streams
            pos.connect(pis);

            // Create and start writer thread
            Thread writerThread = new Thread(new WriterTask(pos));
            Thread readerThread = new Thread(new ReaderTask(pis));

            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            System.err.println("Error connecting pipes: " + e.getMessage());
        }
    }
}

// Writer thread that writes data into PipedOutputStream
class WriterTask implements Runnable {
    private PipedOutputStream pos;

    public WriterTask(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pos))) {
            String[] messages = {"Hello", "This is", "Piped Streams", "in Java!"};

            for (String msg : messages) {
                writer.write(msg);
                writer.newLine();
                writer.flush();
                System.out.println("Writer: Sent -> " + msg);
                Thread.sleep(500); // Simulate delay
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Writer Error: " + e.getMessage());
        }
    }
}

// Reader thread that reads data from PipedInputStream
class ReaderTask implements Runnable {
    private PipedInputStream pis;

    public ReaderTask(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reader: Received -> " + line);
            }
        } catch (IOException e) {
            System.err.println("Reader Error: " + e.getMessage());
        }
    }
}
