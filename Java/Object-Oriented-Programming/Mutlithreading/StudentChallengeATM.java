class ATM {
			
			int count = 0;
		synchronized public void checkBalance(String name){
		
			System.out.print(name + " is checking the ");
			
			try{Thread.sleep(1000);} 
			catch(Exception e){}
			
			System.out.println("balance.");
		
	}
	
		
		synchronized public void withdrawAmount(String name, int amount){
		
			System.out.print(name + " is withdrawing an amount of ");
			
			try{Thread.sleep(1000);} 
			catch(Exception e){}
			
			System.out.print(amount + " rupees.\n");
		
	}
}

class Customerx extends Thread{
	ATM atm;
	String name; 
	int amount;
	
	Customerx(ATM atm,String name, int amount){
		this.name = name;
		this.amount = amount;
		this.atm = atm;
	}
	
	@Override
	public void run(){
		useATM();
		synchronized(this){
			notify();
		}
	}
	
	public void useATM (){
		atm.checkBalance(name);
		atm.withdrawAmount(name, amount);
	}
}

public class StudentChallengeATM {
	public static void main(String [] args){
		ATM atm = new ATM();
		Customerx c1 = new Customerx(atm, "Ian", 5000);
		Customerx c2 = new Customerx(atm, "Neoni", 3000);
		Customerx c3 = new Customerx(atm, "Bittoo", 12000);

		c1.start();
		synchronized(c1){
			try{
				c1.wait();
			}catch(InterruptedException e){}
		}
		c2.start();
		synchronized(c2){
			try{
				c2.wait();
			}catch(InterruptedException e){}
		}
		c3.start();

	}
}