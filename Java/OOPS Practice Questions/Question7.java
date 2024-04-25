import java.util.ArrayList;
import java.util.Collection;

/*7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.*/
class Bank{
    protected String bankName;
    protected String contactNumber;
    protected String branch;
    static ArrayList<Account> accountsCollection = new ArrayList<>();
    Bank() {
        bankName="";
        contactNumber="";
        branch="";
    }
    Bank (String bankName, String contactNumber, String branch) {
        this.bankName = bankName;
        this.contactNumber = contactNumber;
        this.branch = branch;
    }
    public String getBankName(){ return bankName;};
    public String getContactNumber(){ return contactNumber;};
    public String getBranch(){ return branch;};
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public  void addAccount(Account account){
        accountsCollection.add(account);
    }
    public  void removeAccount(Account account) {
        accountsCollection.remove(account);
    }
    public ArrayList<Account> getBankDetails () {
//        System.out.print("Bank name: " + bankName + "\n" +
//                         "Branch: " + branch + "\n" +
//                         "Contact Number: " + contactNumber);
        return accountsCollection;
    }
}
class Account extends  Bank{

    // account class can access the data memebers of the bank
    private String accountNumber;
    private String personName;
    private String dateOfBirth;
    private String phoneNumber;
    private long balance;
    public String getAccountNumber(){ return accountNumber;};
    public String getPersonName(){ return personName;};
    public String getDateOfBirth() { return dateOfBirth;};
    public String getPhoneNumber(){ return phoneNumber;};
    public long getBalance() { return balance; };
    Account (String bankName, String contactNumber, String branch, String personName, String dateOfBirth, String accountNumber, String phoneNumber, long balance) {
        super(bankName, contactNumber, branch);
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }
}
public class Question7 {
    public static void main(String[] args) {
        Bank bank = new Bank("ICICI Bank", "+1 6946549987","A-5, MC Donald Road, New York, USA");

        // account 1
//        bank1.addAccount(bank1);
        Account account1 = new Account("ICICI Bank", "+1 6946549987","A-5, MC Donald Road, New York, USA","Ching Uy", "March 12, 2004", "001012211065", "+3 644465",12546);
        account1.addAccount(account1);
        // account 2
        Account account2 = new Account("Syndicate Bank", "+1 868465468", "B-2, New Walmart Road, New York, USA", "Jason Uy", "March 12, 2004", "001012211065", "+3 644465", 12546);
        account2.addAccount(account2);
        for(Account account : Bank.accountsCollection){
            System.out.print("Bank Name: " + account.getBankName()+"\n" +
                    "Contact: " + account.getContactNumber() + "\n" +
                    "Branch: " + account.getBranch() + "\n" +
                    "Account Holder Name: " + account.getPersonName() + "\n" +
                    "Date of Birth: " + account.getDateOfBirth() + "\n" +
                    "Account Number: " + account.getAccountNumber() + "\n" +
                    "Phone Number: " + account.getPhoneNumber() + "\n" +
                    "Balance: " + account.getBalance() + "\n\n") ;
        }
        System.out.println("Removing account 2");
        account2.removeAccount(account2);
        System.out.println("Account 2 removed ");
        System.out.println("Updated account list: ");

        for(Account account : Bank.accountsCollection){
            System.out.print("Bank Name: " + account.getBankName()+"\n" +
                             "Contact: " + account.getContactNumber() + "\n" +
                             "Branch: " + account.getBranch() + "\n" +
                             "Account Holder Name: " + account.getPersonName() + "\n" +
                             "Date of Birth: " + account.getDateOfBirth() + "\n" +
                             "Account Number: " + account.getAccountNumber() + "\n" +
                             "Phone Number: " + account.getPhoneNumber() + "\n" +
                             "Balance: " + account.getBalance() + "\n\n") ;
        }

    }
}
