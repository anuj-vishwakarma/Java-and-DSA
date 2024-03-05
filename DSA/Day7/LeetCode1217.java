public class LeetCode1217 {
    public static void main(String[] args) {
        int [] positions =  {1,2,3};
        System.out.println(minCostToMoveChips(positions));
    }
    static int minCostToMoveChips(int[] position) {
        // 2,2,2,3,3
        // 0,1,2,3,4
        int odd = 0;
        int even = 0;
        for(int i = 0; i<position.length; i++) {
            if(position[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
