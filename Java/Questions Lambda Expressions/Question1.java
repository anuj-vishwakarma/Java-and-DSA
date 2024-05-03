//1. Write a Java program to implement a lambda expression to find the sum of two integers.

@FunctionalInterface
interface Sum{
    public int sum(int a, int b);
}
public class Question1 {
    public static void main(String[] args) {
        Sum s = (a, b) ->a+b;
        Sum t = (a, b) -> {return a+b;};
        Sum u = Integer::sum;

        System.out.println("The sum using (a,b) -> a+b; is " + s.sum(1,4));
        System.out.println("The sum using (a,b) -> {return a+b; }; is " + t.sum(1,6));
        System.out.println("The sum using Integer::sum is " + u.sum(5,8));
    }
}
