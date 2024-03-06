import java.util.Arrays;

public class LeetCode_SpiralMatrixII {
    public static void main(String[] args) {
        int n = 1;
        int [] [] matrix = generateMatrix(n);
        for(int [] i:matrix){
            for(int x:i){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    static int[][] generateMatrix(int n) {
        int [] [] matrix = new int [n][n];

        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int count = 1;
        while(top <= bottom && left <= right && count<=n*n) {
            //right
            for(int i = left; i<= right; i++) {
                matrix[top][i] = count;
                count++;
            }
            top++;

            //bottom
            for(int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;
            }
            right--;

            //left
            if(top <= bottom) {
                for(int i = right; i >= left; i--){
                    matrix[bottom][i] = count;
                    count++;
                }
                bottom--;
            }

            //top
            if(left<=right){
                for(int i = bottom; i >= top; i--){
                    matrix[i][left] = count;
                    count++;
                }
                left++;
            }
        }
        return matrix;
    }
}
