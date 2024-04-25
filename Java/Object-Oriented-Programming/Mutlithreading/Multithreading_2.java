class MyThread extends  Thread{
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
        }
    }
}
public class Multithreading_2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.setDaemon(true);
        t.start();
        try{
            Thread.sleep(0);
        }catch (Exception e){
            
        }
    }
}