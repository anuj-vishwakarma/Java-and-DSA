/* Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.*/
class Rectangle{
    private int length;
    private int breadth;
    public void setLength(int length) {
        this.length = length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public double Area(){
        return this.length*this.breadth;
    }
    public double perimeter(){
        return 2 * (this.length + this.breadth);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10);
        r1.setBreadth(10);
        System.out.println("Area: " + r1.Area() + "\n" + "Perimeter: " + r1.perimeter());
    }
}
