/*18. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

    Extra Added:
        Place order, billing, tip to waiter

*/

import java.util.ArrayList;

class Restaurant{
    private String restaurantName;
    private String restaurantLocation;
    protected ArrayList<Menu> items = new ArrayList<>();

    private ArrayList<Rating> ratings = new ArrayList<>();

    public void giveRating(int rating, Customer customer){

    }
    Restaurant(){}
    Restaurant(String restaurantName, String restaurantLocation){
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
    }
    public void addItems(Menu item){
        items.add(item);
    }
    public void removeItems(Menu item){
        items.remove(item);
    }
    public void getMenu(){
        System.out.println("\nMenu of our restaurant \n\n" +
                "Dishes" + "\t\t\t\t\t\t" +"Price" + "\n" );
        int counter = 1;
        for(Menu item:items){
//            System.out.println(counter +". "  + item.getDish()+"\t\t\t" + item.getPrice());
            System.out.printf("%d.%-15s\t\t\t%s\n",counter, item.getDish(), item.getPrice());
            counter++;
        }
    }
    public void restaurantInformation(){
        System.out.println("Name: " + this.restaurantName + "\n\n" +
                            "Location: " + this.restaurantLocation );
                            getMenu();
    }
    public int itemsSize(){
        return this.items.size();
    }

}
class Menu {
    private String dish;
    private String price;
    Menu(String dish, String price){
        this.dish = dish;
        this.price = price;
    }

    public String getDish() {
        return dish;
    }
    public void placeOrder(){

    }
    public String getPrice() {
        return price;
    }
}
class Customer extends Restaurant{

    private int orderNumber;
    private  int total = 0;
    ArrayList<Menu> orderedItems = new ArrayList<>();
    public void order(int noOfPlates, Menu item){
//        if(noOfPlates > 1)
            orderedItems.add(item);

            this.total += noOfPlates * Integer.parseInt(item.getPrice().substring(1));



//            return "You have ordered " + noOfPlates +" "+ item.getDish() ;
//        else
//            return "You have ordered " + noOfPlates + " plate " + item.getDish() + "\n";
    }
    public void bill(){
        int total = 0;
        String calculation = "";
        int count= 1;
        for(Menu item:orderedItems){
            total += Integer.parseInt(item.getPrice().substring(1));
        }
        System.out.println("You've ordered");
        System.out.println("Items\t\t\t\t\t\tPrice");
        for(Menu item:orderedItems){
            System.out.printf("%d.%-20s \t\t%s\n",count,item.getDish(),item.getPrice());
        }
        System.out.println(calculation);
        String x = "Total";
        System.out.printf( "%-25s  $%d\n",x, this.total);
    }
}

public class Question18 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("The Grand Vitara","Ground Floor, Near Syndicate Bank, LA, USA");

        Menu item1  = new Menu("Noodle","$5");
        Menu item2  = new Menu("Burger","$4");
        Menu item3  = new Menu("French Fries","$3");
        Menu item4  = new Menu("Barbeque","$8");

        restaurant.addItems(item1);
        restaurant.addItems(item2);
        restaurant.addItems(item3);
        restaurant.addItems(item4);

                restaurant.restaurantInformation();
        System.out.println("--------------------------");
                restaurant.getMenu();
                restaurant.removeItems(item4);

                restaurant.getMenu();

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        customer1.order(1,item1);
        customer1.order(2,item3);
                customer1.bill();

    }
}
class Rating {
    private int rating;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public int getRating() {
        return rating;
    }
}