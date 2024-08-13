import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SolutionTokenProblemHackerrank {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        // Write your code here.
//        scan.close();
//
////            System.out.print(s.substring(matcher.start(), matcher.end()));
//        List<String> list = Arrays.asList(s.trim().split("[.\\s,'_?@!]+"));
//        if(s.matches("\\s+"))
//            System.out.println(0);
//        else
//            System.out.println(list.size());
//        for(String element: list){
//            System.out.println(element);
//        }
//        StringTokenizer stk = new StringTokenizer("Anuj Vishwakarma", " +,!@_",false);
//        while(stk.hasMoreElements()){
//            System.out.println(stk.nextToken());
//        }
//        Scanner input = new Scanner(System.in);
//        try {
//            Pattern.compile(s);
//            System.out.println("Valid");
//        } catch (Exception e) {
//            System.out.println("Invalid");
//        }
//       int testCases=4;
//        while(testCases>0){
//            String pattern = input.nextLine();
//            //Write your code
//            try{
//                Pattern.compile(pattern);
//                System.out.println("Valid");
//            }
//            catch(Exception e){
//                System.out.println("Invalid");
//            }
//        }
        String pattern = "000|[0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-5]|25[0-5]" + "\\." + "000|[0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-5]|25[0-5]" + "\\." + "000|[0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-5]|25[0-5]" + "\\." + "000|[0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-5]|25[0-5]";

        System.out.println("0.0.0.0".matches(pattern));

    }
}
