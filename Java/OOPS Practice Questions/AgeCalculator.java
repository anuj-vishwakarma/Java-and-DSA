import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        /*LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2003,10,24);
        int years = Period.between(birthDate,today).getYears();
        int months = Period.between(birthDate,today).getMonths();
        int days = Period.between(birthDate,today).getDays();
        System.out.println(years + " " + months + " " + days);
*/
        // Manually calculating the age
        int b_day, b_month, b_year, c_day, c_month, c_year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter birth day");
        b_day = input.nextInt();
        System.out.println("Enter birth month");
        b_month = input.nextInt();
        System.out.println("Enter birth year");
        b_year = input.nextInt();


        System.out.println(calculateAge(24, 10, 2003));

    }

    public static String calculateAge(int b_day, int b_month, int b_year) {
        int c_day, c_month, c_year;
        c_day = LocalDate.now().getDayOfMonth();
        c_month = LocalDate.now().getMonthValue();
        c_year = LocalDate.now().getYear();
        int day = 0, month = 0, year = 0;
        // condition checks
        if (b_month < c_month) {
            if (c_day >= b_day) {
                year = c_year - b_year;
                month = c_month - b_month;
                day = c_day - b_day;
            } else {
                year = c_year - b_year - 1;
                month = c_month - b_month;
                day = getDays(b_month) - b_day + c_day;
            }
        } else {
            if (c_day >= b_day) {
                year = c_year - b_year - 1;
                month = 12 - b_month + c_month;
                day = c_day - b_day;
            } else {
                year = c_year - b_year - 1;
                month = 12 - b_month + c_month - 1;
                day = getDays(b_month) - b_day + c_day;
            }
            if (month == 12) {
                ++year;
                month = 0;
            }
        }

        return ("Day: " + day + " Month: " + month + " Year: " + year);
    }

    static int getDays(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 2)
            return 28;
        else {
            return 30;
        }
    }
}
