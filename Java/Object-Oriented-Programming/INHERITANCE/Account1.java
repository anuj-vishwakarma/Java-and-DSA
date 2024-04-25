class Account{
    protected double accountNumber; protected String name; protected String address;
    protected String phNumber; protected String dateOfBirth; protected double balance;
    Account() {
        accountNumber = 000000000;
        name = "NA";
        address = "NA";
        phNumber = "NA";
        dateOfBirth = "NA";
        balance = 0.00000000;
    }
    Account(String name, String dateOfBirth, double accountNumber, double balance, String phNumber, String address) {
        this.accountNumber=accountNumber ;
        this.name = name;
        this.balance = balance;
        this.phNumber = phNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDetails () {
        return
                    "Name: " + name + "\n" +
                    "Date of Birth: " + dateOfBirth + "\n" +
                    "Account Number: " + accountNumber + "\n" +
                    "Balance: " + balance + "\n" +
                    "Phone Number: " + phNumber + "\n" +
                    "Address: " + address + "\n";


    }
}
class SavingAccount extends Account{
    private double depositedAmount;
    private double withdrawnAmount;
    SavingAccount (String name, String dateOfBirth, double accountNumber, double balance, String phNumber, String address) {
        this.accountNumber=accountNumber ;
        this.name = name;
        this.balance = balance;
        this.phNumber = phNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    public double getDepositedAmount() {
        return depositedAmount;
    }

    public void deposit(double depositedAmount) {
        this.depositedAmount = depositedAmount;
        balance += depositedAmount;
    }
    private void setWithdrawnAmount(double withdrawnAmount){
        this.withdrawnAmount = withdrawnAmount;
    }
    public void withdrw(double amount ) {
        setWithdrawnAmount(amount);
        balance-=withdrawnAmount;
    }
}
class LoanAccount extends Account{
    private double emiAmount;
    private double repaymentAmount;
    LoanAccount (String name, String dateOfBirth, double accountNumber, double balance, String phNumber, String address, double emiAmount) {
        this.accountNumber=accountNumber ;
        this.name = name;
        this.balance = balance;
        this.phNumber = phNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.emiAmount = emiAmount;
    }
    void payEMI(double amount) {
        this.emiAmount = this.emiAmount - amount;
    }
    public double getEmiAmount() {
        return this.emiAmount;
    }
}
public class Account1 {
    public static void main(String[] args) {
        Account a = new Account("SUNIYO","12-09-2004",
                1001546348,500,"+1 4234234","Tokyo,Japan");
        System.out.println(a.getDetails());
        SavingAccount s = new SavingAccount("SUNIYO","12-09-2004",
                1001546348,500,"+1 4234234","Tokyo,Japan");

        System.out.println(s.getBalance());
        s.withdrw(200);
        System.out.println(s.getBalance());
        s.deposit(900);
        System.out.println(s.getDepositedAmount());
        System.out.println(s.getBalance());


        LoanAccount l = new LoanAccount("SUNIYO","12-09-2004",
                1001546348,500,"+1 4234234","Tokyo,Japan",600);
        System.out.println("EMI amount: " + l.getEmiAmount());
        l.payEMI(400);
        System.out.println("EMI amount: " + l.getEmiAmount());
    }
}
