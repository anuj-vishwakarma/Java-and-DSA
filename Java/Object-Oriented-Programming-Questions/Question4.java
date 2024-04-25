/*4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle*/

class Circle{
    public int radius;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double Area() {
        return  Math.PI * getRadius()*getRadius();
    }
    public double Circumference() {
        return 2 * Math.PI *getRadius();
    }
}

public class Question4 {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.setRadius(10);
        System.out.println("Area: " + c.Area());
        System.out.println("Circumference: " + c.Circumference());
    }
}
