import java.util.*;

public class Scheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Process> processes = new ArrayList<>();

        System.out.print("Enter number of processes: ");
        int numProcesses = scanner.nextInt();

        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter Arrival Time, Burst Time, Priority for Process " + (i + 1) + ": ");
            int arrival = scanner.nextInt();
            int burst = scanner.nextInt();
            int priority = scanner.nextInt();
            processes.add(new Process(i + 1, arrival, burst, priority));
        }

        System.out.println("\nSelect Scheduling Algorithm:");
        System.out.println("1. FIFO");
        System.out.println("2. SJF");
        System.out.println("3. Round Robin");
        System.out.println("4. Priority Scheduling");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> FIFOScheduler.fifoScheduling(new ArrayList<>(processes));
            case 2 -> SJFScheduler.sjfScheduling(new ArrayList<>(processes));
            case 3 -> {
                System.out.print("Enter Time Quantum: ");
                int quantum = scanner.nextInt();
                RoundRobinScheduler.roundRobinScheduling(new ArrayList<>(processes), quantum);
            }
            case 4 -> PriorityScheduler.priorityScheduling(new ArrayList<>(processes));
            default -> System.out.println("Invalid Choice!");
        }

        Logger.printResults(processes);
        scanner.close();
    }
}
