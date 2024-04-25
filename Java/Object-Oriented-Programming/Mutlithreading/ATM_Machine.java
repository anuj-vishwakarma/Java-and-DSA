
class NewATM  {
	
	public void checkBalance(String name){
//	synchronized(this){
		System.out.println(name + " is  checking the balance");	
//	}
	}
	public void withdraw(String name, int amount){
//	synchronized(this){
		System.out.println(name + " is withdrawing an amount of " + amount + " rupees.");
//	}
	}
}
class Customers extends Thread{
	private String name;
	private int amount;
	
	NewATM atm;
	
	Customers(String name, int amount, NewATM atm){
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}
	public void useATM(){
		synchronized(atm){
		atm.checkBalance(name);
		atm.withdraw(name, amount);
		}

	}
	@Override
	public void run(){
		useATM();
	}
	
}
class ATM_Machine{
	public static void main(String [] args){
		NewATM atm = new NewATM();
		
		Customers c1 = new Customers("Anuj", 4000, atm);
		Customers c2 = new Customers("Bittoo", 6000, atm);
		
		c1.start();
		c2.start();
	}
}
// Author: Anuj Vishwakarma
// Roll Number: 22027115
// 