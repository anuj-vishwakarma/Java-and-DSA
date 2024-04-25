#include <stdio.h>
#include <stdlib.h>

struct FirstComeFirstServe
{
    int process;
    int *arrivalTime;
    int *burstTime;
    int *completionTime;
    int *turnAroundTime;
    int *waitingTime;
    int *responseTime;
};

void setValues(struct FirstComeFirstServe *fcfs)
{
    int i;
    for (i = 2; i <= fcfs->process; i++)
        fcfs->completionTime[i] = fcfs->completionTime[i - 1] + fcfs->burstTime[i];

    for (i = 1; i <= fcfs->process; i++)
        fcfs->turnAroundTime[i] = fcfs->completionTime[i] - fcfs->arrivalTime[i];

    for (i = 1; i <= fcfs->process; i++)
    {
        fcfs->waitingTime[i] = fcfs->turnAroundTime[i] - fcfs->burstTime[i];
        fcfs->responseTime[i] = fcfs->waitingTime[i];
    }
}

void displayResult(struct FirstComeFirstServe fcfs)
{
    int i;
    printf("Process    Arrival Time    Burst Time    Completion Time   Turn Around Time    Waiting Time    Response Time\n");
    for (i = 1; i <= fcfs.process; i++)
    {
        printf("%3c%d%15d%14d%16d%18d%19d%16d\n",
               'P',
               i,
               fcfs.arrivalTime[i],
               fcfs.burstTime[i],
               fcfs.completionTime[i],
               fcfs.turnAroundTime[i],
               fcfs.waitingTime[i],
               fcfs.responseTime[i]);
    }
}

int main()
{
    struct FirstComeFirstServe obj;
    printf("Enter number of processes: ");
    scanf("%d", &obj.process);

    obj.arrivalTime = (int *)malloc((obj.process + 1) * sizeof(int));
    obj.burstTime = (int *)malloc((obj.process + 1) * sizeof(int));
    obj.completionTime = (int *)malloc((obj.process + 1) * sizeof(int));
    obj.turnAroundTime = (int *)malloc((obj.process + 1) * sizeof(int));
    obj.waitingTime = (int *)malloc((obj.process + 1) * sizeof(int));
    obj.responseTime = (int *)malloc((obj.process + 1) * sizeof(int));

    int i;
    for (i = 1; i <= obj.process; i++)
    {
        printf("Enter the Arrival and Burst time for process %d: ", i);
        scanf("%d %d", &obj.arrivalTime[i], &obj.burstTime[i]);
    }

    obj.completionTime[1] = obj.burstTime[1] - obj.arrivalTime[1];
    setValues(&obj);
    displayResult(obj);

    free(obj.arrivalTime);
    free(obj.burstTime);
    free(obj.completionTime);
    free(obj.turnAroundTime);
    free(obj.waitingTime);
    free(obj.responseTime);

    return 0;
}