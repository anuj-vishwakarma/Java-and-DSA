class Sup{
    void display() {
        System.out.println("Sup class display");
    }
}
class Sub extends Sup{

    void display () {
        System.out.println("Sub class display");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Sup su = new Sup();
        su.display();

        Sub sub = new Sub();
        sub.display();

        Sup sup = new Sub();
        sup.display();
    }
}
