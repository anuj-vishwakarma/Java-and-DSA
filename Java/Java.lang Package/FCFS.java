import java.util.Scanner;

class FirstComeFirstServe {
    int process;
    int[] arrivalTime;
    int[] burstTime;
    int[] completionTime;
    int[] turnAroundTime;
    int[] waitingTime;
    int[] responseTime;

    void setValues() {
        for (int i = 2; i <= process; i++)
            completionTime[i] = completionTime[i - 1] + burstTime[i];

        for (int i = 1; i <= process; i++)
            turnAroundTime[i] = completionTime[i] - arrivalTime[i];

        for (int i = 1; i <= process; i++) {
            waitingTime[i] = turnAroundTime[i] - burstTime[i];
            responseTime[i] = waitingTime[i];
        }
    }

    void displayResult() {
        System.out.println("Process    Arrival Time    Burst Time    Completion Time   Turn Around Time    Waiting Time    Response Time");
        for (int i = 1; i <= process; i++) {
            System.out.printf("%3c%d%15d%14d%16d%18d%19d%16d\n",
                    'P',
                    i,
                    arrivalTime[i],
                    burstTime[i],
                    completionTime[i],
                    turnAroundTime[i],
                    waitingTime[i],
                    responseTime[i]);
        }

        float avgTAT = 0, avgWT = 0, avgRT = 0;

        for (int i = 1; i <= process; i++) {
            avgTAT += turnAroundTime[i];
            avgRT += responseTime[i];
            avgWT += waitingTime[i];
        }

        System.out.printf("Average Turn Around Time: %.3f\n", avgTAT / process);
        System.out.printf("Average Waiting Time: %.3f\n", avgWT / process);
        System.out.printf("Average Response Time: %.3f\n", avgRT / process);
    }
}

public class FCFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstComeFirstServe obj = new FirstComeFirstServe();
        System.out.print("Enter number of processes: ");
        obj.process = scanner.nextInt();

        obj.arrivalTime = new int[obj.process + 1];
        obj.burstTime = new int[obj.process + 1];
        obj.completionTime = new int[obj.process + 1];
        obj.turnAroundTime = new int[obj.process + 1];
        obj.waitingTime = new int[obj.process + 1];
        obj.responseTime = new int[obj.process + 1];

        for (int i = 1; i <= obj.process; i++) {
            obj.arrivalTime[i] = 0;
        }

        for (int i = 1; i <= obj.process; i++) {
            System.out.printf("Enter the Burst time for process %d: ", i);
            obj.burstTime[i] = scanner.nextInt();
        }

        obj.completionTime[1] = obj.burstTime[1];
        obj.setValues();
        obj.displayResult();

        scanner.close();
    }
}
