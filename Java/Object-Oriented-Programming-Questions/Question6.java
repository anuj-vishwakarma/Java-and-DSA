/*6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.*/

class Employee{
    private String name;
    private String jobTitle;
    private String salary;
    Employee(String name, String jobTitle, String
            salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSalary(String salary){
        this.salary = salary;
    }
    public void addSalary(long amount){
        System.out.print("Amount $" + amount + " has been added in your current salary, and ");
        System.out.print("Your updated salary is " );
        long salary= Long.parseLong(this.salary.replace("$",""));
        salary+=amount;
        setSalary(salary+"");
    }
    public String getName(){return name;}
    public String getJobTitle(){return jobTitle;};
    public String getSalary(){return "$"+salary;};
    public String getDetails() {
        return ("Name: " + name + "\n" +
                            "Job Title: " + jobTitle + "\n" +
                            "Salary: " + salary);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("David", "Penetration Tester", "$100");

        System.out.println(e1.getDetails());
        e1.addSalary(100);

        System.out.println(e1.getSalary());
    }
}
