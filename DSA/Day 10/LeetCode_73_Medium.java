//https://leetcode.com/problems/set-matrix-zeroes/

class LeetCode_73_Medium {
    public static void main(String[] args) {
        int [][]nums = {{1,2,3}, {4,1,9}};
        setZeroes(nums);
        for(int []x:nums){
            for(int y:x){
                System.out.print(y);
            }
            System.out.println();
        }
    }
    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rowIndex = -1;
        int colIndex = -1;
        int [] [] copyArr = new int [m][n];

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                copyArr[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++) {
                if(matrix[i][j] == 0){
                    makeZeroes(copyArr, i, j);
                }
            }
        }
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                matrix[i][j] = copyArr[i][j];
            }
        }

    }
    static void makeZeroes(int [][] arr, int rowIndex, int colIndex){
        // making row elements zero
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                if(i==rowIndex) {
                    arr[i][j] = 0;
                }
            }
        }
        // making col elements zero
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                if(j==colIndex) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}