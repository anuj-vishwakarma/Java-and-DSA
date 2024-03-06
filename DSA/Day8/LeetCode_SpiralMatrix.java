import java.util.ArrayList;
import java.util.List;
public class LeetCode_SpiralMatrix {
    public static void main(String[] args) {
        int [] [] matrix = {{2,1,5}, {1,8,9},{3,7,6}};
        System.out.println(spiral(matrix));
    }
    static List <Integer> spiral (int [][] nums) {
        List <Integer> list = new ArrayList <>();
        int m = nums.length;
        int n = nums[0].length;
        int left = 0, right = n-1;
        int top = 0, bottom = m-1;
        while(top <= bottom && left <= right) {
            //right
            for(int i = left; i<=right; i++) {
                list.add(nums[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++) {
                list.add(nums[i][right]);
            }
            right--;
            if(top <= bottom) {
            for(int i = right; i >= left; i--) {
                list.add(nums[bottom][i]);
            }
            bottom--;
            }
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(nums[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
