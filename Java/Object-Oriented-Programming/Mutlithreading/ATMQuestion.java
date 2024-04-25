


class ATM1
{
    
    synchronized public void checkBalance(String name)
    {
       System.out.print(name + " Checking ");

       try{Thread.sleep(1000);}catch(Exception e){}

       System.out.println("Balance");
    }

    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(amount);

    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM1 atm;
    
    Customer(String n,ATM1 a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    { 
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class ATMQuestion 
{
    public static void main(String[] args) 
    {
        ATM1 atm=new ATM1();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        try{
        c1.join();
        c2.join();

        }
        catch (Exception e){}
        c1.start();
        c2.start();
    }   
}