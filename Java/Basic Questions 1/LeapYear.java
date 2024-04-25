import java.lang.*;
import java.sql.SQLOutput;
import java.util.*;
public class LeapYear {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an year to check : ");
        int year = input.nextInt();

        if(year % 400 == 0)
            System.out.println(year + " is Leap Year. ");
        else if(year % 4 == 0)
            System.out.println(year + " is a Leap Year. ");
        else
            System.out.println(year + " is not a Leap Year. ");
    }
}
