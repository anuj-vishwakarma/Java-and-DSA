import java.util.Scanner;
public class Greetings {
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        System.out.println("Welcome, " + name + "! Have a wonderful day ahead!");
    }
}
