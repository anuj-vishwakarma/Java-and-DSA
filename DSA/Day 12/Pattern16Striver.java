public class Pattern16Striver {
    public static void main(String[] args) {
        print(5);
    }
    static void print (int n){

        //        char x = 'A';
//        for (int i = 0; i < n; i++) {
//            for(char ch = x; ch <= x+i; ch++){
//                System.out.print(x);
//            }
//            System.out.println();
//            x++;
//        }
         //             OR

        for (int i = 0; i < n; i++) {
            char ch =  (char)('A'+ i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
