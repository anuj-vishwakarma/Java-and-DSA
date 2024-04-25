public class Printing_Revision {
    public static void main(String[] args) {
//        int a = 2;
//        System.out.format("%-5d", a);
//        int b = 2;
//        System.out.printf("%+d",b);
        char c [ ] = { 'A', 'B', 'C', 'D'};
        String str1 = new String ( c );
        System.out.println(str1);

        byte [] x = {1, 2, 3, 4, 5};
        String str2 = new String (x);
        System.out.println(str2);
        String name = "   Anuj    Vishwakarma     ";
        System.out.println(name.trim());
    }
}
