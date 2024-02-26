// Not a correct way to find square root

public class Solution {
    public static void main(String[] args) {
        int x = 625;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {
        int start  = 0;
        int end = 0;
        int div = x / 2;
        if(x / 2 * x / 2 == x){
            return x/2;
        }
        else {
            while(x < div*div){
                end = div;
                if(div*div > x){
                    div = div / 2;
                    start = div;
                }
            }
        }

        // finding the value of starting and end numbers 

        int min = Integer.MAX_VALUE;
        for(int i = start; i<= end; i++){
            int p = i*i;
            if(p < x){
                if(x - p < min){
                    min = i;
                }
            }
        }
        return min;
    }
}