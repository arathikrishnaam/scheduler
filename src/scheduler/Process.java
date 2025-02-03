public class Process {
    int id, arrivalTime, burstTime, remainingTime, priority;
    int startTime = -1, completionTime, waitingTime, turnaroundTime;

    public Process(int id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }

    public void calculateTimes(int start, int end) {
        this.startTime = start;
        this.completionTime = end;
        this.turnaroundTime = end - arrivalTime;
        this.waitingTime = turnaroundTime - burstTime;
    }
}
