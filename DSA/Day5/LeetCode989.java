import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class LeetCode989 {
    public static void main(String[] args) {
        int [] num = {9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int p = num.length-1;
        int carry = 0;
        while(p>=0 || k>0){
            int numvalue = 0;
            if(p>=0){
                numvalue=num[p];
            }
            int digitk = k % 10;
            int sum = digitk + numvalue + carry;
            int digitSum = sum % 10;
            carry = sum / 10;
            list.add(digitSum);
            p--;
            k = k /10;
        }
        if(carry>0){
            list.add(carry);
        }
        Collections.reverse(list);
        return list;
    }
}
