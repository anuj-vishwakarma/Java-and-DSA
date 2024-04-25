
class MyThread1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello");
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i +" Hello");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
    public MyThread2(String name){
        super(name); // setting the name of thread
        setPriority(Thread.MIN_PRIORITY+2);
    }
}
public class Multithreadin_1 {
    public static void main(String[] args) {
        MyThread1 m = new MyThread1();
        Thread th1 = new Thread(m);
        // or
        Thread th2 = new Thread(new MyThread1());
        // or
        Thread th3 = new Thread(new MyThread1(), "th3");

        MyThread2 m1 = new MyThread2("mth1");

//        m1.setPriority(10); // or we can do it in the constructor itself, preferred to use constructor method, if you wanna
//        set the priority equals to 3, don't just set the value as 3 rather use, this: (MIN_PRIORITY+2)

        System.out.println("ID: " + m1.getId());
        System.out.println("Name: " + m1.getName());
        System.out.println("Priority: " + m1.getPriority());
        m1.start(); // if you start right now the thread will execute damn fast, to slow it down we can use sleep method,
        // check the MyThread2 class
        m1.interrupt(); // this will interrupt the thread causing InterruptedException to occur which will be managed by try and catch We've used interrupt one time so it will interrupt for one time.
        System.out.println("State: " + m1.getState());
        System.out.println("Alive: " + m1.isAlive());
    }
}
