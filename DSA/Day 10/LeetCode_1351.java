// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class LeetCode_1351 {
    public static void main(String[] args) {
        int [] [] nums = {{1,2,4},{-1,2,-5}};
        System.out.println(countNegatives(nums));
    }
    static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j<grid[i].length; j++) {
                if(grid[i][j] < 0)
                    count++;
            }
        }
        return count;
    }
}
