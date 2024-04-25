class Circle{
    public double radius;
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference() {
        return perimeter();
    }
}
class Rectangle{
    public int length;
    public int breadth;
    public int area() {
        return length*breadth;
    }
    public int perimeter() {
        return 2 * (length + breadth);
    }
    public boolean isSquare() {
        return (length == breadth);
    }
}
public class How_to_write_a_class {
    public static void main(String[] args) {

        System.out.println("Circle");

        Circle c1 = new Circle();
        c1.radius = 3;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());

        System.out.println("Rectangle");

        Rectangle r1 = new Rectangle();
        r1.length = 3;
        r1.breadth = 4;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());

        System.out.println();
    }
}
