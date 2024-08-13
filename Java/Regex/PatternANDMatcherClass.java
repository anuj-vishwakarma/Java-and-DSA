import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternANDMatcherClass {
    public static void main(String[] args) {
        String str = "hi my name is anuj vishwakarma";
        Pattern pattern = Pattern.compile("[a-z]+");

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
