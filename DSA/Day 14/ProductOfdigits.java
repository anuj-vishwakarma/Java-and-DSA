public class ProductOfdigits {
    public static void main(String[] args) {
        System.out.println(product1(204));
    }
    static int product1(int n){
        int d = n % 10;
        int x    = n / 10;
        if(n == 0)
            return 1;
        return d * product1(x);
    }
    static int product2(int n){
        int d = n % 10;
        if(n == 0)
            return 1;
        return d * product2(n/10);
    }
    static int product3 (int n){
        if(n == 0)
            return 1;
        return (n%10) * product3(n / 10);
    }
}

