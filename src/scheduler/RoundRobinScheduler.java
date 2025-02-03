import java.util.*;

public class RoundRobinScheduler {
    public static void roundRobinScheduling(List<Process> processes, int quantum) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        Queue<Process> queue = new LinkedList<>();
        int currentTime = 0, index = 0;

        while (!queue.isEmpty() || index < processes.size()) {
            while (index < processes.size() && processes.get(index).arrivalTime <= currentTime) {
                queue.add(processes.get(index++));
            }

            if (!queue.isEmpty()) {
                Process p = queue.poll();
                int timeSlice = Math.min(quantum, p.remainingTime);
                p.remainingTime -= timeSlice;
                currentTime += timeSlice;

                if (p.remainingTime > 0) queue.add(p);
                else p.calculateTimes(currentTime - timeSlice, currentTime);
            } else {
                currentTime = processes.get(index).arrivalTime;
            }
        }
    }
}
