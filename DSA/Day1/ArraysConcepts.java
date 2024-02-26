import java.util.Arrays;
public class ArraysConcepts {
    public static void main(String[] args) {
        int [] nums = {2, 3, 1, 9};
        change(nums);
        System.out.println(Arrays.toString(nums));

        int [ ] [ ] arr2d = {
                {1 , 2, 4}, // 0th index
                {3, 8},      // 1st index
                { 5, 9, 11, 7 }// 2nd index
        };
        System.out.println(arr2d[1].length);
        try{
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < arr2d[col].length; col++) {
                    System.out.print(arr2d[row][col] + " ");
                }
                System.out.println("");
            }

        }catch (Exception e) {
            System.out.println("ArraysIndexOfBoundException");
        }
    }
    static void change(int [] arr) {
        arr[0] = 42;
    }
}
