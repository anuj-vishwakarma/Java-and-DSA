import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int [] [] arr = {
                {2,24, 94, 1, 9},
                {23, 5, 0, -1, 3, 5,7},
                {3, 1, 6},
                {42,6,91, 34}
        };
        int target = 3;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int [] [] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                    return new int [] {row, col};
            }
        }
        return new int [] {Integer.MIN_VALUE, Integer.MAX_VALUE};
    }
}
