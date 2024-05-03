//9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.

interface prime{
    public boolean isPrime(int n);
}
public class Question9 {
    public static void main(String[] args) {
        prime p = n -> {
            if(n <= 2)
                return false;
            for(int i = 2; i*i <= n; i++){
                if(n%i == 0)
                    return false;
            }
            return true;
        };
        System.out.println(p.isPrime(5));
    }
}

/*
        Prime number:
        factors: itself and 1
        5
        9


* */