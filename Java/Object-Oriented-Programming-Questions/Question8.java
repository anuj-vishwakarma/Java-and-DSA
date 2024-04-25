/*8. Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.*/
class TrafficLight{
    private String color;
    private int duration;
    TrafficLight(){
        color="green";
        duration=0;
    }
    public void changeColor(String color){
        this.color = color.toLowerCase();
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public boolean isIt(String color){
        // THis won't work because strings are immutable youcan't modify
        /*
        color.toLowerCase();
        this.color.toLowerCase();
        return (color == this.color);
        */
        return (color.toLowerCase().equals( this.color.toLowerCase()));

    }
}
public class Question8 {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        t.changeColor("red");
        t.setDuration(60);
        System.out.println(t.isIt("Red"));
    }
}
