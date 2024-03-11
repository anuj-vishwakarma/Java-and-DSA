public class Question1Lecture2 {
    public static void main(String[] args) {
        print1(5);
    }

//    static int print(int n) {
//
//        if (n == 1) {
//            System.out.println(n);
//            return 1;
//        }
//        System.out.println(n);
//        System.out.println(n+print(n-1));
//        return n + print(n - 1);
//    }
    static void print1(int n ) {
        if(n == 0)
            return;
        System.out.println(n);
        print1(n-1);
    }
}
