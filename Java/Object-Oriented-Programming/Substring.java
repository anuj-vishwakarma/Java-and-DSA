public class Substring {
    public static void main(String[] args) {
        String str = "24-10-2003";
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(str.indexOf('-')+1,str.lastIndexOf('-')));
        System.out.println(str.substring(str.lastIndexOf('-')+1));

    }
}
