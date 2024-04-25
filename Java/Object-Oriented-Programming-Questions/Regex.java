public class Regex {
    public static void main(String[] args) {
        String str = "32:";
        System.out.println(str.matches("\\d*:"));
    }
}