
class Circle {
    public double radius;
    Circle () {
        radius = 0.0;
    }
    public double area() {
        return Math.PI * radius*radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
class Cylinder extends  Circle{
    public double height;
    Cylinder() {
        height = 0.0;
    }
    public double volume() {
        return area() * height;
    }
}
public class Circle1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius =   1;
        System.out.println(c1.area());
        Cylinder c2 = new Cylinder();
        c2.radius = 1;
        c2.height = 1;
        System.out.println(c2.volume());
        System.out.println(c2.area());
    }
}
