public class Pattern11_Striver {
    public static void main(String[] args) {
    pattern(5);
    }
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            int value = 1;
            if(i%2 == 0)
                value = 1;
            else
                value = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(value);
                value = 1 - value;
            }
            System.out.println();
        }
    }
}
/*
the task is to print
     0 1 2 3 4
0    1
1    0 1
2    1 0 1
3    0 1 0 1
4    1 0 1 0 1

*/
