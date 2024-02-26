public class MinNo {
    public static void main(String[] args) {
        int [] arr = {14, 20, 3, 1, 36 ,32};
        System.out.println(min(arr));
    }
    static int min (int [] arr) {
        int minValue = arr[0]; // assuming the first element of array to be minimum
        // finding min value in array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minValue)
                minValue = arr[i]; // if the current element is less than minimum element then update the minValue to current element
        }
        return minValue;
    }
}
