public class SquareRootOfANumber {
    public static void main(String[] args) {
        System.out.println(findSquareRoot(9));
    }
    static double findSquareRoot(int n) {
        double left = 1;
        double right = n;

        double precision = 0.0000001;
        while(right-left>precision) {
            double mid = left + (right - left) / 2;
            double square = mid*mid;
            if(Math.abs(square - n) < precision) // here(square == n) is not a correct method of comparing
                // since mid is double type so, square could be double and
                //comparing it using == operator is not a correct method, because square ain't gonna be exactly
                // equal to n
        // SO IT IS BETTER RECOMMENDED THAT USE :
                // if(Math.abs(square - n) < precision)
                return mid;
            else if(square > n)
                right = mid;
            else
                left = mid;
        }
        String formattedResult = String.format("%.6f", right);

        double decimalNumber = Double.parseDouble(formattedResult);

        return decimalNumber;
    }
}
