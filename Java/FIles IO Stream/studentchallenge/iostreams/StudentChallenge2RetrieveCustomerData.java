package studentchallenge.iostreams;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class StudentChallenge2RetrieveCustomerData {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            FileInputStream fis = new FileInputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\studentchallenge\\iostreams\\StudentChallengewrite.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int x = ois.read();

//            System.out.println(ois.read()); // returns -1 now
//            for(int i = 1; i <= ois.read() /*ois.read()*/; i++){  // if you write ois.read(); and think that it will return the integer that is stored in the first place then you're wrong because when it executes ois.read(); for the first time then after executing the file pointer starts pointing to next element (Sequential Access of file) and after that when ois.read() is called it is returning -1 so loops is not executing further so, we're getting only the details of first customer;
//                try {
//                    Customer c = (Customer) ois.readObject();
//                    System.out.println(c);
//                } catch (ClassNotFoundException e) {
//                    System.out.println(e.getLocalizedMessage());
//                }
//            }
//

            Customer [] list = new Customer[x];
            for(int i = 0; i<x; i++){
                try {
                    list[i] = (Customer) ois.readObject();
                } catch (ClassNotFoundException e) {
                    System.out.println(e.getLocalizedMessage());
                }
            }

            System.out.println("Enter the name of Customer whose details you want: ");
            String name = input.nextLine();
            /*
            for(Customer customer : list){
                if(name.equalsIgnoreCase(customer.name))
                    System.out.println(customer);
            }
            */


            // Trying to do the just above code commented in multiline comment using Lambda Expression
            /*
                Arrays.asList(list).forEach(s -> {
                    if(s.name.equalsIgnoreCase(name))
                        System.out.println(s);
                });

             */
            // This one is more Optimized Lambda expression than mine(above)
            Arrays.stream(list)
                    .filter(s -> s != null && name.equalsIgnoreCase(s.name))
                    .forEach(System.out::println);


            ois.close();
            fis.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
