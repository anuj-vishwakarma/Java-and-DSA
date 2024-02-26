public class Sqrt {
    public static void main(String[] args) {
        int x = 32343;
        System.out.println(mySqrt(x));
    }

    static  int mySqrt(int x) {
        int start = 1;
        int end = x;
        if (x == 0 || x == 1)
            return x;

        else {

            while (start <= end) {
                int mid = start + (end - start) / 2;
                long square = (long) mid * mid;
                if (square == x)
                    return (int) mid;
                else if (square > x)
                    end = mid - 1;
                else
                    start = mid + 1;

            }
        }
        return end;
    }
}
