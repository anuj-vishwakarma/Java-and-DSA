public class StackOverFlowImportantConcept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n ) {
        if(n == 0)
            return ;
        System.out.println(n);
        fun(n--); // fun(n--) will give infinite recursion or stack over-flow error,
        // because n-- passes the value first and then decrements
        // So it'll pass 5 again and again till stack overflow error
    }
}
