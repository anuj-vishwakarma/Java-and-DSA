import java.util.Date;
class Student{
    private String rollNo;
    private String accountNo;
    private static int count = 1;
    private static int accountCounter = 1;
    Student(){
        rollNo = generateRollNo();
        accountNo = generateAccountNo();
    }
    private String generateAccountNo(){
        String n = "0010" + (new Date().getYear() + 1900) + accountCounter;
        accountCounter++;
        return n;
    }
    private String generateRollNo(){
        Date d = new Date();
        String rNo = "GGV-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rNo;
    }
    public String getRollNo(){
        return rollNo;
    }
    public String getAccountNo(){
        return accountNo;
    }
}

public class StudentChallengeStatic {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.getRollNo());
        System.out.println(s1.getAccountNo());
        System.out.println(s2.getRollNo());
        System.out.println(s2.getAccountNo());
    }
}
