import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int [] [] arr = {
                {2,24, 94, 1, 9},
                {23, 5, 0, -1, 3, 5,7},
                {3, 1, 6},
                {42,6,91, 34}
        };
        int  ans = search(arr);
        System.out.println(ans);
    }
    static int search(int [] [] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element = 0; element < ints.length; element++) {
                if (ints[element] > maxValue)
                     maxValue = ints[element];
            }
        }
        return maxValue;
    }
}
