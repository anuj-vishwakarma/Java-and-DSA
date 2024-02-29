public class fl {
    public static void main(String[] args) {
        int number = 4; // Example number
        System.out.println("Square root of " + number + ": " + findSquareRoot(number));
    }

    // Method to find the square root using binary search
    public static double findSquareRoot(int x) {
        if (x == 0 || x == 1) // Base cases: Square root of 0 and 1 is the number itself
            return x;

        double left = 1; // initalizing
        double right = x; //
        double precision = 0.000001;

        // Binary search loop in range
        while (right - left > precision) {
            double mid = left + (right - left) / 2;
            double square = mid * mid;

            if (Math.abs(square - x)< precision) {
                return mid;
            } else if (square < x) {
                left = mid; // Update left if square is less than x
            } else {
                right = mid; // Update right if square is greater than x
            }
        }
        return left; // Return left as it's the closest approximation
    }
}