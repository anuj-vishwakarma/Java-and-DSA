
class MyNewThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i++);
        }
    }

}
class MyNewThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i++);
        }
    }

}
public class Multithreading_3_usingJOINmethod {
    public static void main(String[] args) {
        MyNewThread1 th1 = new MyNewThread1();
        MyNewThread2 th2 = new MyNewThread2();
        th1.setDaemon(true);
        th2.setDaemon(true);

        th1.start();
        th2.start();

        Thread th = Thread.currentThread();
        try {
            th.join();
        }
        catch (Exception e){

        }
    }
}
