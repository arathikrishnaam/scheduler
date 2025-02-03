import java.util.*;

public class PriorityScheduler {
    public static void priorityScheduling(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        PriorityQueue<Process> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.priority));
        int currentTime = 0, index = 0;

        while (!queue.isEmpty() || index < processes.size()) {
            while (index < processes.size() && processes.get(index).arrivalTime <= currentTime) {
                queue.add(processes.get(index++));
            }

            if (!queue.isEmpty()) {
                Process p = queue.poll();
                p.calculateTimes(currentTime, currentTime + p.burstTime);
                currentTime += p.burstTime;
            } else {
                currentTime = processes.get(index).arrivalTime;
            }
        }
    }
}
