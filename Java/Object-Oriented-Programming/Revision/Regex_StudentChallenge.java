public class Regex_StudentChallenge {
    public static void main(String[] args) {
        // checking if a number is binary or not
        String number = "101001100110";
//        System.out.println(number.matches("[10]+"));


        // checking if a number is hexadecimal or not
        number = "1f";
//        System.out.println(number.matches("[0-9A-fa-f]+"));

        // checking if a date is in the form of dd/mm/yyyy
        String date = "31/12/2021";
        System.out.println(date.matches("[0-3]?[1-9]/[0-1][1-9]/\\d{4}"));
    }
}
