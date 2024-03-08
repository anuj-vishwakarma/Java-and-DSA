public class InvertedPyramid {
    public static void main(String[] args) {
        pattern(5);
   }
    static void pattern (int n){

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
