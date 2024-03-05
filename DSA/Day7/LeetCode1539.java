public class LeetCode1539 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int k = 3;
        System.out.println(findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr, int k) {
        int[] ans = new int[k];

        int count = 0;
        int missingNumber = 1;

        for (int i = 0; count < k; missingNumber++) {
            if (i < arr.length && arr[i] == missingNumber) {
                // Moving to the next element in arr
                i++;
            } else {
                // Storing the missing number
                ans[count++] = missingNumber;
            }
        }

        return ans[k - 1]; // Return the kth missing positive integer
    }
}
