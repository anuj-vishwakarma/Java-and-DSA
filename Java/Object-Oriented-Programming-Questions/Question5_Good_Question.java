/*5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.*/
//Did the question on first try, but it was a bit wrong

import java.util.ArrayList;

class Book{
    private String title;
    private String author;
    private String ISBN;
    Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    private static ArrayList<Book>  bookCollections = new ArrayList<>();
    public void addBook(Book book) {
        bookCollections.add(book);
    }
    public void removeBook(Book book){
        bookCollections.remove(book);
    }
    public void setTitle(String title) {this.title = title;}
    public String getTitle() {return this.title;};
    public String getAuthor() {return this.author;};
    public String getISBN() {return this.ISBN;};
    public static ArrayList<Book> getBookCollections(){
        return bookCollections;
    }
}


public class Question5_Good_Question{
    public static void main(String[] args) {
        Book book1 = new Book("C Programming","Danis Ritchie","12654693");
        Book book2 = new Book("Linux Basic for Hackers", "OTW","21644649");
        book1.addBook(book1);
        book2.addBook(book2);
        ArrayList<Book> bookCollections = Book.getBookCollections();
        System.out.println("Book list: ");
        for(Book b:bookCollections){
            System.out.println( "Title: " + b.getTitle()+
                                ", Author: " + b.getAuthor() +
                                ", ISBN: " + b.getISBN());
        }
        book1.removeBook(book1);
        System.out.print("Book removed, the removed book is: ");
        System.out.println( "Title: " + book1.getTitle()+
                ", Author: " + book1.getAuthor() +
                ", ISBN: " + book1.getISBN());


        System.out.println("\nUpdated Book list: ");
        for(Book b:bookCollections){
            System.out.println( "Title: " + b.getTitle()+
                    ", Author: " + b.getAuthor() +
                    ", ISBN: " + b.getISBN());
        }
    }
}