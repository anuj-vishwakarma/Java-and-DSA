public class IpCheck {
    public static void main(String[] args) {
        String ip = "212.212.221.222";
        String regex = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        System.out.println(ip.matches( regex));
        String str = "ab baab  ";
        System.out.println(str.matches("(\\w*\\s?)*"));
    }
}
