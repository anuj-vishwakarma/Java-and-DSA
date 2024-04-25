

/*12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.*/
class Airplane{
    private final int flightNumber;
    private String destination;
    private final String departureTime;
    private final String expectedTimeToReach;
    private int delay;
    Airplane(int flightNumber, String destination, String departureTime, String expectedTimeToReach){
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.departureTime=departureTime;
        this.expectedTimeToReach=expectedTimeToReach;
    }
    public void changeDestination(String destination){
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }


    public String getFlightDelay() {
        int delayHour = this.delay/60;
        int delayMinutes = this.delay%60;
        if(delayHour==0 && delayMinutes==0)
            return 0+"";
        else if(delayHour==0)
            return ":"+delayMinutes;
        else if(delayMinutes != 0)
            return delayHour+":"+delayMinutes;
        else
            return delayHour+":" ;
    }
    public String checkFlightStatus(){

        if(getFlightDelay().matches("\\d*"))
            return "Flight " + getFlightNumber() + " is on time.";
        else if (getFlightDelay().matches("\\d*:"))
            return "Flight " + getFlightNumber() +" is delayed by " + getFlightDelay().substring(0,getFlightDelay().indexOf(':')) + " hour(s)";
        else if(getFlightDelay().matches(":\\d*"))
            return "Flight " + getFlightNumber() + " is delayed by " + getFlightDelay().substring(getFlightDelay().indexOf(':')+1)+ " minute(s)";
        else
            return "Flight " + getFlightNumber() + " is delayed by " + getFlightDelay().substring(0,getFlightDelay().indexOf(':')) + " hour(s) and " + getFlightDelay().substring(getFlightDelay().indexOf(':')+1) + " minute(s) ";
    }

    public void delay(int delay){
        this.delay = delay;
    }
    public String flightDuration(){
        String expectedArrivalHour=this.expectedTimeToReach.substring(0,2);
        String expectedArrivalMinute=this.expectedTimeToReach.substring(3,5);
        int hour = Integer.parseInt(expectedArrivalHour) ;
        int minute = Integer.parseInt(expectedArrivalMinute) ;
        if(hour >= Integer.parseInt(this.departureTime.substring(0,2))) {
            if(minute>=Integer.parseInt(this.departureTime.substring(3,5))){
                hour = hour - Integer.parseInt(this.departureTime.substring(0,2));
                minute = minute - Integer.parseInt(this.departureTime.substring(3,5));
            }
            else {
                hour = hour - Integer.parseInt(this.departureTime.substring(0,2)) - 1;
                minute = 60 - Integer.parseInt(this.departureTime.substring(3,5)) + minute;
            }
        }
        else { // hour < departureHour
            if(minute>=Integer.parseInt(this.departureTime.substring(3,5))){
                hour = 24 - Integer.parseInt(this.departureTime.substring(0,2)) + hour;
                minute = minute - Integer.parseInt(this.departureTime.substring(3,5));
            }
            else {
                // 12-39    09-39  19-31
                // 10-10
                hour = 24 - Integer.parseInt(this.departureTime.substring(0,2)) + hour - 1;
                minute =70 -  Integer.parseInt(this.departureTime.substring(3,5));
            }
        }
        if(hour == 0 && minute!=0)
            return "The duration of flight " + getFlightNumber() + " is " + (minute+"") + " minutes ";
        else if (hour != 0 && minute==0)
            return  "The duration of flight " + getFlightNumber() + " is " + (hour+"") + " hours ";
        else if (hour == 0)
            return "Invalid 0 duration";
        else
            return  "The duration of flight " + getFlightNumber() + " is " + (hour+"") + " hours and " + (minute+"") + " minutes";


    }

}
public class Question12 {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane(2312,"New York, USA", "12:21", "12:50");
        Airplane flight2 = new Airplane(6594,"Los Angeles, USA", "01:21", "03:59");
        flight1.delay(7);
        System.out.println(flight1.flightDuration());
        System.out.println(flight1.checkFlightStatus());
        flight2.delay(60);
        System.out.println(flight2.flightDuration());
        System.out.println(flight2.checkFlightStatus());

    }
}

