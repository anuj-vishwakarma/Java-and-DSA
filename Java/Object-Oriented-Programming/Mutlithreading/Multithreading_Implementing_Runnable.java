class Test implements  Runnable{
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class Multithreading_Implementing_Runnable implements Runnable {
    @Override
    public void run(){
        while (true){
            int i = 1;
            System.out.println(i + "Hi");
            i++;
        }
    }
    public static void main(String[] args) {

//        Multithreading_Implementing_Runnable t = new Multithreading_Implementing_Runnable ();
//        Thread th = new Thread(t);
//        th.start();

        Thread thread = new Thread(new Runnable() { // anonymous class passing as parameter to the Thread class constructor  
            @Override
            public void run() {
                int j = 1;
                while(true){
                    System.out.println(j + "hello");
                    j++;
                }
            }
        });
        thread.start();
        int i = 1;
        while(true){
            System.out.println(i + "World");
            i++;
        }
    }
}
