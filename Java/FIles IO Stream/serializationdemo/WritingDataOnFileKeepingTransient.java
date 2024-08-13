
package serializationdemo;
import java.io.*;

class Student1 implements Serializable {
    private int id;private String name;private String dept;
    private float avg;public static int data = 12;
    public transient int t = 4;
    public Student1() {}
    public Student1(int id, String name, String dept, float avg) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.avg = avg;
        this.t = t;
        data = 500;
        t = 500;
    }
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        // Manually initialize transient variable after deserialization important h if you want to retain the initialized value
        t = 4;
    }
    public String toString() {
        return "Id : " + id + "\n" +
                "Name : " + name + "\n" +
                "Department : " + dept + "\n" +
                "Average : " + avg + "\n" +
                "Data : " + data + "\n" +
                "Transient : " + this.t;
    }
}


public class WritingDataOnFileKeepingTransient{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\serializationdemo\\fileKeepingTransient.txt");
        Student1 s = new Student1(10, "John", "CSE", 98.9f);

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        oos.close();
        fos.close();
    }
}
