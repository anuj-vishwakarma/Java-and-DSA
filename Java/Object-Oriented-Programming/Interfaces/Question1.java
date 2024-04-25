/*1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 */

interface Shape{
    public double getArea();
}
class Rectangle implements Shape{
    public int length, breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double getArea() {
        return length * breadth;
    }
}

class Triangle implements Shape{
    public int base, height;
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (1.0/2.0) * base * height;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 6);

        Shape triangle = new Triangle(3, 8);
        System.out.println("The area of triangle is " + triangle.getArea());
        System.out.println("The area of rectangle is " + rectangle.getArea());
    }
}
