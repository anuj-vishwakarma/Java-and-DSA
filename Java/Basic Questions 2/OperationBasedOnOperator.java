import java.util.Scanner;
public class OperationBasedOnOperator {
    public static void main (String [] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter the operation you wanna perform: ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println("The answer is " + (a + b));
            case '-' -> System.out.println("The answer is " + (a - b));
            case '*' -> System.out.println("The answer is " + (a * b));
            case '/' -> System.out.println("The answer is " + (a / b));
            default -> System.out.println("Enter valid input!");
        }


    }
}
