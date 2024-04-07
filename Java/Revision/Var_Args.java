public class Var_Args {
    public static void main(String[] args) {
        System.out.println(sum(9,2));
        String s = "3242432.32";
        System.out.println(s.matches("[0-9\\.]+"));
    }
    static int sum ( int...args){
        int sum = 0;
        for(int x:args){
            sum+=x;
        }
        return sum;
    }
}
