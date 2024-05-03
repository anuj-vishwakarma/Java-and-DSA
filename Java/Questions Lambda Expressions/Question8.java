//8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.

@FunctionalInterface
interface Factorial{
    public int factorial(int n);
}

public class Question8 {
    public static void main(String[] args) {
        Factorial f = n -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        };
        System.out.println(f.factorial(4));

        int n = 4;

    }

}
