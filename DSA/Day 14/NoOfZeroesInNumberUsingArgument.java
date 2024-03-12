public class NoOfZeroesInNumberUsingArgument {
    public static void main(String[] args) {
        System.out.println(zeroes(12001));
    }
    static int zeroes(int n){
        int count = 0;
        return helper(n/10, count);
    }
    static int helper(int n, int count){
        if(n%10==0)
            return count;
        return helper(n, count+1);
    }
}
