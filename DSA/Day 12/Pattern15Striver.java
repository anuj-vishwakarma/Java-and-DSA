public class Pattern15Striver {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i = 0; i<n; i++){
            for(char ch = 'A'; ch < 'A'+n-i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
