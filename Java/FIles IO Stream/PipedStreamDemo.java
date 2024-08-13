import java.io.*;
class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream os){
        this.os = os;
    }
    @Override
    public void run(){
        int counter = 1;
        while (true){
            try{
                os.write(counter); // Producer will write down inside an output stream, but there ain't guarantee that the data is sent on the other side. So we need to use flush so that data is sent on other side
                os.flush();
                System.out.println("Producer is producing : " + counter);
                System.out.flush();
                Thread.sleep(10);
                counter++;
            } catch (Exception e){}
        }
    }
}
class Consumer extends Thread{
    InputStream is;
    public Consumer(InputStream is){
        this.is = is;
    }
    @Override
    public void run(){
        int x;
        while (true){
            try{
                x = is.read();
                System.out.println("Consumer is consuming: " + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (Exception e){}
        }
    }
}
public class PipedStreamDemo {
    public static void main(String[] args) throws Exception{
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        Producer producer = new Producer(pipedOutputStream);
        Consumer consumer = new Consumer(pipedInputStream);

        pipedInputStream.connect(pipedOutputStream);

        producer.start();
        consumer.start();
    }
}
