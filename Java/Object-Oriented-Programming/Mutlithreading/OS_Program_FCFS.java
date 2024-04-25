import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class FirstComeFirstServe{
    private ArrayList<Integer> burstTime = new ArrayList<>();
    private ArrayList<Integer> arrivalTime = new ArrayList<>();
    private ArrayList<Integer> turnAroundTime = new ArrayList<>();
    private ArrayList<Integer> waitingTime = new ArrayList<>();
    private ArrayList<Integer> responseTime = new ArrayList<>();
    private int numberOfProcesses;
    FirstComeFirstServe(ArrayList <Integer> burstTime, ArrayList <Integer> arrivalTime, int numberOfProcesses){
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.numberOfProcesses = numberOfProcesses;
        for(int i = 0; i<numberOfProcesses; i++) {
            arrivalTime.add(i, 0);
        }
    }
    public void getTurnAroundTimeForEachProcess(){
            turnAroundTime.add(burstTime.get(0));
        for(int i = 1; i<=numberOfProcesses-1; i++ ){
            turnAroundTime.add(burstTime.get(i) + turnAroundTime.get(i-1));
        }
//          System.out.println("The turn around time for processes are :");

        int counter = 0;
        for(int element : turnAroundTime) {
//            System.out.printf("P%-5d: %5d\n", counter++, element);
        }
    }

    public void getWaitingTime(){
        getTurnAroundTimeForEachProcess();
        System.out.printf("%s%17s%15s%21s\n", "Processes  |", "Arrival Time  |","Burst Time  |","Turn Around Time  |");

        int counter = 0;

    for(int i = 0; i<numberOfProcesses; i++) {
        for(int element : turnAroundTime) {
                System.out.printf("\tP%-5d %c%9d%8c%8d %6c\n", ++counter, '|', 0, '|',this.burstTime.get(i++), '|');
            }
        }
    }
}
public class OS_Program_FCFS {
    public static void main(String[] args) {
        
        ArrayList<Integer> burstTime = new ArrayList<>();
        ArrayList<Integer> arrivalTime = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total number of processes: ");
        int noofProcesses = input.nextInt();

        System.out.println("Enter burst time for each process: ");
        for(int i = 0; i<noofProcesses; i++){
            burstTime.add(input.nextInt());
        }

        FirstComeFirstServe fcfs = new FirstComeFirstServe(burstTime, arrivalTime, noofProcesses);
        fcfs.getWaitingTime();
    }

}
