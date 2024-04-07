public class RegularExpressionsRevision {
    public static void main(String[] args) {
        String str1 = "9";
//        System.out.println(str1.matches("."));
//        System.out.println(str1.matches("[abc]")); // checks only for single character
//        System.out.println(str1.matches("[^abc]"));// except abc anything could be there
//        // but it should be present only one eg. e, x, s
//        System.out.println(str1.matches("[a-z0-9]"));
        // it's for checking single character too but the range is from
        // a to z and 0 - 9 ( including 9 )

        String str2 = "f9";
//        System.out.println(str2.matches("[a-z][0-9]"));
        // it checks for two characters
        // out of the two characters first must be an alphabet and second must be
        // a number from 0-9
        // if we check eg. a8 it will return true, whereas for 8a it will return false

        String str3 = "a";
//        System.out.println(str3.matches("a|b"));
        // either a or b then returns true

        String str4 = "acb";
//        System.out.println(str4.matches("abc"));
        // exactly abc should be present otherwise returns false

        // META CHARACTERS

        /*
            \d for one single digits
            \D except digit
            \s Space
            \S except space
            \w alphabets or digit
            \W except alphabet and digit

            we will write code as \\w or \\s because single backslash considered
            as escape sequence character
        */

        String str5 = "a";
//        System.out.println(str5.matches("\\w"));


        // QUANTIFIERS

        /*
            * one or more times
            ? 0 or more times
            + 1 or more time
            {k} k times
            {m, n} minimum m and maximum n times
        */

        String email = "john.12@gmail.com";

        System.out.println(email.matches("[\\w.]*@gmail.com"));

    }
}
