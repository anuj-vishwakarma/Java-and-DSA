abstract class Shape1{
    abstract public double  Area();
    abstract public double Perimeter();
}
class Rectangle1 extends Shape1{
    private double length;
    private double breadth;
    Rectangle1 (double length, double breadth){
        this.breadth = breadth;
        this.length = length;
    }
    @Override
    public double Area(){
        return length*breadth;
    }
    @Override
    public double Perimeter(){
        return 2 * (length + breadth);
    }
}
class Circle1 extends Shape1{
    private final double  radius;
    Circle1 (double radius){
        this.radius = radius;
    }
    @Override
    public double Area(){
        return Math.PI * radius * radius;
    }
    @Override
    public double Perimeter(){
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shape1 {
    private double side1;
    private double side2;
    private double side3;

    @Override
    public double Perimeter() {
        return side1+side2+side3;
    }

    @Override
    public double Area() {
        double s = Perimeter();
        s/=2;
        if(side1 >=0 && side2 >= 0 && side3 >= 0)
            return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return 0;
    }
}
public class Question16 {
    public static void main(String[] args) {
        Shape1 s = new Circle1(1);
        System.out.println(s.Area());
        System.out.println(s.Perimeter());
    }
}
