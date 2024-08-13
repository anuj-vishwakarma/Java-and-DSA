//package serializationdemo;
//
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//class Student implements Serializable {
//    private int id; private String name; private String dept;
//    private float avg; public static int data =  12;
//    public transient int t = 4;
//    public void setId(int id) {
//        this.id = id;
//    }
//    public Student(int id, String name, String dept, float avg) {
//        this.id = id;
//        this.name = name;
//        this.dept = dept;
//        this.avg = avg;
//        this.t = t;
//        data = 500;
//        t = 500;
//    }
//public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDept(String dept) {
//        this.dept = dept;
//    }
//
//    public void setAvg(float avg) {
//        this.avg = avg;
//    }
//
//    public String toString () {
//        return "Id : " + id + "\n" +
//                "Name : " +  name + "\n" +
//                "Department : " + dept+ "\n" +
//                "Average : " + avg+ "\n" +
//                "Data : " + data+ "\n" +
//                "Transient : " + this.t;
//    }
//}
//public class fdfasf {
//    public static void main(String[] args) throws Exception{
//        FileOutputStream fos = new FileOutputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\serializationdemo\\file.txt");
//        Student s = new Student(25, "John", "CSE", 99.9f);
//        s.setId(10);
//        s.setName("John");
//        s.setDept("CSE");
//        s.setAvg(99.6f);
//
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(s);
//
//        oos.close();
//        fos.close();
//    }
//}
