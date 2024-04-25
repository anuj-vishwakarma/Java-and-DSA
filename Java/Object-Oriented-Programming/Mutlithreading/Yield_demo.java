class Thread1 extends Thread{
	@Override
	public void run(){
		int i = 1; 
		while(true){
			System.out.println("Thread" + i);
			i++;
		}
	}
}
public class Yield_demo {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
		t.start();
		
		int count = 1;
		while(true){
		Thread.yield();
		System.out.println("Main" + count);
		}
    }
}
