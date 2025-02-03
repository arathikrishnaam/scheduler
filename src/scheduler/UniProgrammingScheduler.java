import java.util.Comparator;
import java.util.List;

public class UniProgrammingScheduler {
    public static void uniProgrammingScheduling(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        int currentTime = 0;
        for (Process p : processes) {
            if (currentTime < p.arrivalTime) {
                currentTime = p.arrivalTime;
            }
            System.out.println("Process " + p.id + " starts at " + currentTime);
            currentTime += p.burstTime;
            System.out.println("Process " + p.id + " finishes at " + currentTime);
        }
    }
}