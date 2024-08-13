package studentchallenge.iostreams;

import java.io.*;

class Customer implements Serializable {
    String customerID;
    String name;
    String phoneNo;
    static int counter = 1;
    public Customer(){

    }
    public Customer(String name, String phoneNo){
        customerID = "C" +counter++;
        this.name = name;
        this.phoneNo = phoneNo;
    }
    public String toString () {
        return
                "Customer Details: " + " \n" +
                "Customer ID: " + customerID + "\n" +
                "Name: " + name + "\n" +
                "Phone Number: " + phoneNo + "\n";
    }
}
public class StudentChallenge2StoreCustomerData {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\studentchallenge\\iostreams\\StudentChallengewrite.txt");
           ObjectOutputStream oos = new ObjectOutputStream(fos);
            Customer c1 = new Customer("Ian", "+2 452342");
            Customer c2 = new Customer("Neoni", "+2 843343");
            Customer c3 = new Customer("Bittoo", "+2 542342");
            Customer c4 = new Customer("Kanu", "+2 623421");
            Customer c5 = new Customer("Komal Di", "+2 545232");

            Customer [] list = {c1, c2, c3, c4, c5};
            oos.write(list.length);
            for (Customer customer : list)
                oos.writeObject(customer);

            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
