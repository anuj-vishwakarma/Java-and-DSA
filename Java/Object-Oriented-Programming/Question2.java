/*  Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set
their attributes using the constructor and modify the attributes using the setter methods and print the updated values.*/

class Dog {
    private String name;
    private String breed;
    Dog(){
        name = "Biffa";
        breed = "German Shepherd";
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Phew");
        dog1.setBreed("Labrador");

        Dog dog2 = new Dog();
        dog2.setName("Inigo");
        dog2.setBreed("Chihuahua");
    }
}
