import  java.util.Scanner;
public class String_StudentChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.next();
        // ian.21@gmail.com
        if(email.matches("[\\w.]*@gmail.com"))
            System.out.println("The entered email address is a gmail account!");
        // in place of regular expressions we can use simple inbuilt method
//        email.startsWith("gmail"); to find out whether it has gmail present
//        or we can do like, remove the substring from @ to . and use .equals to check if the string content
//        is equals to gmail
        else
            System.out.println("The entered email address is not a gmail account!");
        // extracting username and domain

        System.out.println("The username is " + email.substring(0, email.indexOf('@')) + " and domain is " + email.substring(email.indexOf('@')+1));

        System.out.println(email.startsWith("gmail"));

    }
}
