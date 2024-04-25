/*17. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.*/

import java.util.ArrayList;
import java.util.Arrays;

class Movie{
    private String title;
    private String director;
    private ArrayList<Actors> actors = new ArrayList<>();
    private ArrayList<Reviews>reviews = new ArrayList<>();
    Movie(String title, String director, Actors...actors){
        this.title = title;
        this.director = director;
        this.actors.addAll(Arrays.asList(actors));
    }
    public String getMovieDetails(){
//        StringBuilder actorsDetail = new StringBuilder();  // this
        String actorsDetail = "";
        for(Actors actors:actors){
            actorsDetail = actorsDetail + actors.getActorDetails();
//            actorsDetail.append(actors.getActorDetails());  and this are used together
//            preferable for string concatenation

        }
        return "Movie: " + this.title + "\n" +
                "Director: " + this.director + "\n" +
                "Actors: \n" + actorsDetail;

    }
    public void addReview(Reviews review){
        this.reviews.add(review);
    }
    public void removeReview(Reviews review){
        reviews.remove(review);
    }
    public String retrieveReviews(){
        String allReview = "";
        for(Reviews review: reviews){
            allReview = allReview + review.getReview() + "\n";
        }
        return "Total reviews of the movie are : \n" + allReview;
    }
}
class Actors{
    private String name;
    private int age;
    Actors(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getActorDetails(){
        return "Name: " + getName() + "\n" +
                "Age: " + this.age + "\n";
    }
}
class Reviews{
    private String review;
    Reviews(String review) {
        this.review = review;
    }
    public String getReview() {
        return review;
    }
}

public class Question17 {
    public static void main(String[] args) {
        Actors actor1 = new Actors("Dharmendra",25);
        Actors actor2 = new Actors("Amitabh Bachchan",29);
        Actors actor3 = new Actors("Hema Malini",24);
        Movie m1 = new Movie("Sholay", "Ramesh Sippy",actor1,actor2,actor3);
        System.out.println(m1.getMovieDetails());
        Reviews review1 = new Reviews("This movie is damn good, I've watched this one 100s of time");
        Reviews review2 = new Reviews("You should really watch this, 10/10 for the acting and dialogues");

        m1.addReview(review1);
        m1.addReview(review2);

        System.out.println(m1.retrieveReviews());

        m1.removeReview(review1);
        System.out.println("Removed review1");
        System.out.println(m1.retrieveReviews());
    }
}
