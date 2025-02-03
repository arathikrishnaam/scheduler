import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Logger {
    public static void printResults(List<Process> processes) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            System.out.println("\nProcess Execution Summary:");
            writer.write("Process Execution Summary:\n");

            for (Process p : processes) {
                if (p.startTime != -1) {
                    System.out.println("Process " + p.id + " | Start: " + p.startTime + " | Finish: " + p.completionTime);
                    writer.write("Process " + p.id + " | Start: " + p.startTime + " | Finish: " + p.completionTime + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing log file: " + e.getMessage());
        }
    }
}
