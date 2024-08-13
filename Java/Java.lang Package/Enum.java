import java.util.Arrays;
import java.lang.Enum;

enum Department{
    CSE, IT, CIVIL,ECE;
    Department(){
        System.out.println(this);
    }

}

enum  Dept{
    CSE("John", "Block: A"), IT("Adam", "Block: B"), ECE("Smith", "Block: C");
    String head, location;
    Dept(String head, String location){
        this.head = head;
        this.location = location;
        System.out.println(this);
    }
    public void display(){
        System.out.println(this);
    }

    public String getLocation() {
        return location;
    }

    public String getHead() {
        return head;
    }
}
public class Enum {
    public static void main(String[] args) {
//        Department department = Department.IT;
//        System.out.println(department);

//        Department [] list = Department.values();
//        System.out.println(Arrays.toString(list));

       /* Department d= Department.CSE;
        switch(d){
            case CSE:
                System.out.println("Head: John \nBlock: A");
                break;
            case IT:
                System.out.println("Head: Smith \nBlock: D");
                break;
            case CIVIL:
                System.out.println("Head: Ramesh \nBlock: C");
                break;
            case ECE:
                System.out.println("Head: Adam \nBlock: B");
                break;
        }
    */
//        Dept dept = Dept.CSE;
//        System.out.println(dept.getHead());
//        System.out.println(dept.getLocation());

//        dept.display();

        Department d = Department.CIVIL;

    }
}
