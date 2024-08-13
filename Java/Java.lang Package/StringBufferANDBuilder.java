public class StringBufferANDBuilder {
    public static void main(String[] args){
        System.out.println(Character.isAlphabetic('A'));
        String d = "Hello, ";
        d.concat("Cruel world!");
        System.out.println(d);
        String f = d.concat("Cruel world!");
        System.out.println(f);

        StringBuffer sb = new StringBuffer("Hello, ");
        sb.append("Cruel World");
        sb.insert(0, "\t");
        System.out.println(sb);

    }
}
