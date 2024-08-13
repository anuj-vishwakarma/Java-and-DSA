package SerializationProblemSolution1;

import java.io.*;
public class ReadingDataFromFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/Files IO Stream/Files/My.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student student = new Student();
        student.id = Integer.parseInt(br.readLine());
        student.name = br.readLine();
        student.dept = br.readLine();

        System.out.println("Roll no : " + student.id);
        System.out.println("Name : " + student.name);
        System.out.println("Department : " + student.dept);
        fis.close();
    }
}
