public class PyramidplusInvertedPyramid {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n ) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-1-i; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }

            for (int l = 0; l < n-i-1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0; i<n; i++){

            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = i; j <2*n-1-i ; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
