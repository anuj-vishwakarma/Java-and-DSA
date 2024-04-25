abstract class Shape {
    abstract public double Area();
    abstract public double Perimeter();
}
class Circle extends Shape{
    private int radius;
    Circle (int radius){
        this.radius = radius;
    }
    @Override
    public double Area(){
        return Math.PI * radius * radius;
    }
    @Override
    public double Perimeter() {
        return Math.PI * 2 * radius;
    }
}
class Rectangle extends Shape{
    private int length;
    private int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double Area() {
        return length*breadth;
    }
    @Override
    public double Perimeter() {
        return 2 * ( length + breadth );
    }
}
public class AbstractClassExample1 {
    public static void main(String[] args) {
        Shape s = new Circle(1);
        System.out.println(s.Area());
        System.out.println(s.Perimeter());

        Shape s2 = new Rectangle(1,2);
        System.out.println(s2.Area());
        System.out.println(s2.Perimeter());
    }
}
