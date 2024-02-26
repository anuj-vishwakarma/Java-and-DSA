
//https://leetcode.com/problems/richest-customer-wealth/submissions/1184170428/
public class LeetCode1672_MaxWealth {
    public static void main(String[] args) {
        int [] [] accounts = {
                {2, 3, 1},
                {3, 4, 1}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;// we initialized to zero because wealth can't be negative
        // but if the wealth could be negative then we must have initialized the
        // max value to Integer.MIN_VALUE;
        for(int person = 0; person<accounts.length;person++){
            int sum = 0;
            for (int account = 0; account<accounts[person].length;account++){
                sum = sum + accounts[person][account];
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
