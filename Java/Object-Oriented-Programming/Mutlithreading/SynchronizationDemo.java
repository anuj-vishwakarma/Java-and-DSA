class MyData{
	public void display(String str){
		synchronized(this){
			for(int i = 0; i<str.length(); i++){
			System.out.print(str.charAt(i));
		}
		}
	}
}
class MyThread01 extends Thread{
	MyData d; 
	public  MyThread01(MyData d){
		this.d = d;
	}
	@Override
	public void run(){
		d.display("Hello World");
	}
}
class MyThread02 extends Thread{
	MyData data;
	public  MyThread02(MyData data){
		this.data = data;
	}
	@Override
	public void run(){
		data.display("Welcome All");
	}
}
public class SynchronizationDemo{
	public static void main(String [] args){
		MyData data = new MyData();
		
		MyThread01 th1 = new MyThread01(data);
		MyThread02 th2 = new MyThread02(data);
		
		th1.start();
		th2.start();
	}
}