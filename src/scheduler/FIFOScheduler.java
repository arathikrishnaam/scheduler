import java.util.*;

public class FIFOScheduler {
    public static void fifoScheduling(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        int currentTime = 0;

        for (Process p : processes) {
            if (currentTime < p.arrivalTime) currentTime = p.arrivalTime;
            p.calculateTimes(currentTime, currentTime + p.burstTime);
            currentTime += p.burstTime;
        }
    }
}
