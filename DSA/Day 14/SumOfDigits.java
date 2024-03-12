public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum4(1324));
    }
    static int sum (int n){
        int d = n % 10;
        int x    = n / 10;
        if(n == 0)
            return 0;
        return d + sum(x);
    }
    static int sum1 (int n){
        int d = n % 10;
        if(n == 0)
            return 0;
        return d + sum1(n/10);
    }
    static int sum3 (int n){
        if(n == 0)
            return 0;
        return (n%10) + sum3(n / 10);
    }
    static int sum4 (int n){
        int d = n % 10;
        n    = n / 10;
        if(n == 0)
            return 0;
        return d + sum4(n);
    }
}

