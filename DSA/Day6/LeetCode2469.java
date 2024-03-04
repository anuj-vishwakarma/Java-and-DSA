import java.util.*;
class LeetCode2469 {
    public static void main(String[] args) {
        double celsius = 321.32;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
        static double[] convertTemperature(double celsius) {
        double [] ans = new double [2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }
}