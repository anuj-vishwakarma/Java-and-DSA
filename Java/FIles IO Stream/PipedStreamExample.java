import java.io.*;

public class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        // Create piped streams
        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();

        // Connect the input and output streams
        inputStream.connect(outputStream);

        // Create producer and consumer threads
        Thread producer = new Thread(new Producer(outputStream));
        Thread consumer = new Thread(new Consumer(inputStream));

        // Start the threads
        producer.start();
        consumer.start();
    }

    static class Producer implements Runnable {
        private final OutputStream outputStream;


        Producer(OutputStream outputStream) {
            this.outputStream = outputStream;
        }

        @Override
        public void run() {
            try {

                outputStream.write("Hello from producer!".getBytes());
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private final InputStream inputStream;

        Consumer(InputStream inputStream) {
            this.inputStream = inputStream;
        }

        @Override
        public void run() {
            try {
                // Read data from the input stream
                int data;
                while ((data = inputStream.read()) != -1) {
                    System.out.print((char) data);
                }
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
