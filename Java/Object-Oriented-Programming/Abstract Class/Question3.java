/*3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
 */

abstract class BankAccount{
    protected int balance;
    private String accountHolderName;
    abstract public void deposit(int amount);
    abstract public void withdraw(int amount);
}
class SavingsAccount extends BankAccount{
    @Override
    public void deposit(int amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(int amount) {
        balance-=amount;
    }
}
class CurrentAccount extends BankAccount{
    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }
}
public class Question3 {
}
