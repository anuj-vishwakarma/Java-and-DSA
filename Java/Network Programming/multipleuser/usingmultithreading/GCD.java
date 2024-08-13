package multipleuser.usingmultithreading;

public class GCD {
    public static void main(String[] args) {
        System.out.println(firstContact(3,4));
    }
    static void gcdMethod1(int n, int m){
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        if( b == 0) {
            System.out.println(a);
            return;
        }        gcdMethod1(a-b,b);
    }
    static void gcdMethod2(int n, int m){
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        int gcd = 0;
        while(b!=0){
            int temp = b;
            b = a - b;
            if(b > temp){
                a = b;
                b = temp;
            }
            else a = temp;

        }
        System.out.println(a);
    }
    static void gcdMethod3(int a, int b){
        if(b==0){
            System.out.println(a);
            return;
        }
        gcdMethod3(b, a%b);
    }
    static  int gcdMethod4(int a, int b){
        while(a > 0 && b > 0){

            if(a>b) a = a%b;
            else b = b % a;
        }
            return a+b;
    }
    public static long firstContact(int N, int M) {
        // code here
        return (int)(N * ((long)M / gcdMethod4(N,M)));
    }
    static long gcd(int a, int b){
        while(a > 0 && b > 0){
            if(a>b) a = a%b;
            else b = b % a;
        }
        return a;
    }
}
