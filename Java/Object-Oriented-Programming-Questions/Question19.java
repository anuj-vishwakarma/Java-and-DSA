import java.util.ArrayList;

/*19. Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.
 */
class Booking{
    ArrayList<Flight> flights = new ArrayList<>();
    ArrayList<Hotel> hotels = new ArrayList<>();
    ArrayList<Hotel> bookedHotels = new ArrayList<>();
    ArrayList<Flight> bookedFlights = new ArrayList<>();
    public void getBookingInformation(){

    }
    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public void addHotel(Hotel hotel){
        hotels.add(hotel);
    }
    public String searchFlight(Flight flight){
        for(Flight f : flights){
            if(flight.equals(f))
                return "Available";
        }
        return "Not available";
    }
    public String searchHotel(Hotel hotel){
        for(Hotel h:hotels){
            if(hotel.equals(h))
                return "Available";
        }
        return "Not available";
    }
    public void bookFlight(Flight flight){
        this.flights.remove(flight);
        this.bookedFlights.add(flight);
    }
    public void bookHotel(Hotel hotel){
        this.hotels.remove(hotel);
        this.bookedHotels.add(hotel);
    }

    public void bookedFlightsInformation() {
        String bookedFlightDetails = "";
        int counter = 1;
        System.out.println("Booked flight details: ");
        for(Flight flight: bookedFlights){
            bookedFlightDetails += counter + "." + flight.getFlightName() + "\n";
            counter++;
        }
        System.out.println(bookedFlightDetails);
    }
    public void bookedHotelsInformation() {
        String bookedHotelsDetails = "";
        int counter = 1;
        System.out.println("Booked hotels details: ");
        for(Hotel hotel: bookedHotels){
            bookedHotelsDetails += counter + "." + hotel.getHotelName() + "\n";
            counter++;
        }
        System.out.println(bookedHotelsDetails);
    }

}
class Flight{
    private String flightName;
    private String origin;
    private String destination;
    private String time;
    Flight(String flightName, String origin, String destination, String time){
        this.flightName = flightName;
        this.origin = origin;
        this.destination = destination;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getTime() {
        return time;
    }
}

class Hotel{
    private String hotelName;
    private String location;
    private String price;
    private String bedType;
    private String contactNumber;
    Hotel(String hotelName, String location, String price, String bedType, String contactNumber){
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
        this.bedType = bedType;
        this.contactNumber = contactNumber;
    }

    public String getPrice() {
        return price;
    }

    public String getBedType() {
        return bedType;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getLocation() {
        return location;
    }

}
public class Question19 {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Emirates","Tokyo, Japan", "California, USA", "10:15");
        Flight flight2 = new Flight("Indigo","Beijing, China", "Los Angeles, USA", "21:30");
        Flight flight3 = new Flight("Vistara","New Delhi, India", "Saudi Arabia, UAE", "13:15");

        Booking management1 = new Booking();

        management1.addFlight(flight1);
        management1.addFlight(flight2);
        management1.addFlight(flight3);

        Hotel hotel1 = new Hotel("Hotel OK","Light Road, Bangkok", "$300", "Single","+31 3902343212");
        Hotel hotel2 = new Hotel("Galaxy Heights", "Washington, USA", "$340","Double/Single","+21 903903432");
        Hotel hotel3 = new Hotel("Hotel Grand", "Silicon Valley", "$550","Single/Double","+34 9239020329");

        management1.addHotel(hotel1);
        management1.addHotel(hotel2);
        management1.addHotel(hotel3);

        System.out.println(management1.searchFlight(flight2));

        management1.bookHotel(hotel2);
        management1.bookFlight(flight1);
        management1.bookFlight(flight2);

        management1.bookedHotelsInformation();

        management1.bookedFlightsInformation();
        management1.bookedHotelsInformation();
    }
}
