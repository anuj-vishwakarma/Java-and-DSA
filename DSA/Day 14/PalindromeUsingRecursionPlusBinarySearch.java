public class PalindromeUsingRecursionPlusBinarySearch {
    public static void main(String[] args) {
        System.out.println(isPalidrome(121));
    }
    static boolean isPalidrome(int n){
        String str = n + "";
        int s = 0;
        int e = str.length()-1;
        return p(n,s,e)==1;
    }
    static int p(int n, int s, int e){
        String str = n + "";
        if(s >= e)
            return 1;
        if(str.charAt(s) == str.charAt(e))
            return p(n, s+1, e-1);
        return -1;
    }

}
