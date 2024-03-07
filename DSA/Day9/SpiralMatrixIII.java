import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix-iii/
public class SpiralMatrixIII {
    public static void main(String[] args) {
        int [][] matrix = {{1,24,4,5},{32,3,1,5}, {2,5,1,6}};
        int rows = 3;
        int cols = 3;
        int rStart = 0;
        int cStart = 2;
        for(int []x : spiralMatrixIII(rows,cols,rStart,cStart)){
            for(int y:x){
                System.out.println(y);
            }
            System.out.println();
        }
    }
    static boolean isValid(int i, int j, int rows, int cols){
        return (i<rows && j<cols && i >= 0 && j >= 0);
    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List <int[]> ans = new ArrayList<>();
        ans.add(new int[] {rStart, cStart});

        int step = 1;
        int i = rStart, j = cStart;

        while(ans.size() < rows*cols){
            if(ans.size() < rows*cols)
                return listToArray(ans);

            int k = 0;
            while (k < step){
                j++;
                if(isValid(i,j,rows,cols))  {
                    ans.add(new int[] {i,j});
                    if(ans.size() == rows*cols)
                        return listToArray(ans);
                }
                k++;
            }

            k=0;
            while (k < step) {
                i++;
                if(isValid(i,j,rows,cols)) {
                    ans.add(new int[]{i, j});
                    if (ans.size() == rows * cols)
                        return listToArray(ans);
                }
                k++;
            }
            step++;
            k=0;
            while (k < step ) {
                j--;
                if(isValid(i,j,rows,cols)){
                    ans.add(new int[] {i,j});
                        if(ans.size() == rows * cols)
                            return listToArray(ans);
                }
                k++;
            }
            k = 0;
            while (k < step){
                i--;
                if(isValid(i,j,rows,cols)){
                    ans.add(new int[]{i,j});
                        if(ans.size() == rows * cols)
                            return listToArray(ans);
                }
                k++;
            }
            step++;
        }
        return listToArray(ans);
    }
    static int [][] listToArray(List <int[]> list){
        int [][]result = new int [list.size()][2];
        for(int i = 0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
