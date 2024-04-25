abstract class Myy{
    abstract void display();
}
interface x {
    void print();
}
interface y {
    void print();
}
class New{
    int x = 2;
}
class Outer {
    public void display(){
        Inner i = new Inner();
        i.show();

    }
    int x = 2;
    int  y = 3;
    Inner i = new Inner();
    class Inner extends New implements x, y{
        public void show(){
            System.out.println(x + " " + y);
        }

        public void print(){
            Myy m = new Myy() {
                public void display(){
                    System.out.println("hello, it's from anonymouse class");
                }
            };
            System.out.println("Hi, printed");
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.show();
        Outer o = new Outer();
        o.display();
    }

}
