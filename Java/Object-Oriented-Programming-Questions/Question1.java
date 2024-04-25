//  1. Write a Java program to create a class called "Person" with a name and age attribute.
//   Create two instances of the "Person" class, set their attributes using
//   the constructor, and print their name and age.

class Person {
    private String name;
    private int age;
    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Person p1 = new Person("Nobita", 10);
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());

        Person p2 = new Person("Shizuka", 10);
        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
    }
}
