public class Sum {
    public static void main(String[] args) {
        System.out.println(sum4(1324));
    }
    static int sum4 (int n){
        int d = n % 10;
        n    = n / 10;
        if(n == 0)
            return 0;
        return d + sum4(n);
    }
}
