import java.time.LocalDate;

/*Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.*/
class EmployeeDetails {
    private String name;
    private String salary;
    private String hiringDate;

    EmployeeDetails(String name, String salary, String hiringDate) {
        this.name = name;
        this.salary = salary;
        this.hiringDate = hiringDate;
    }

    public String getName() {
        return name;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
// 24-10-2003
//public String calculateYearsOfService(int h_day, int h_month, int h_year) {
public String calculateYearsOfService(String hiringDate) {
         int h_day = Integer.parseInt(hiringDate.substring(0, 2));
         int h_month = Integer.parseInt(hiringDate.substring(
                                                            hiringDate.indexOf('-')+1,
                                                            hiringDate.lastIndexOf('-'))
                                                                        );
         int h_year = Integer.parseInt(hiringDate.substring(hiringDate.lastIndexOf('-') + 1));

    return "The total years of service from hiring date " + hiringDate + " till " + LocalDate.now() + " is: " +  calculateAge((h_day),(h_month),(h_year));}

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

        return ( "\n" + year + " years " + month + " months and " + day + " days");
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

    public static class Question9_NotDone {
        public static void main(String[] args) {
            EmployeeDetails e = new EmployeeDetails("Ajay", "152464", "24-10-2003");
//            System.out.println(e.calculateYearsOfService(24,10, 2003));
            System.out.print(e.calculateYearsOfService("04-02-2016"));

        }
    }
}
