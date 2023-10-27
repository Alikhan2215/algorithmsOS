import java.util.ArrayList;
import java.util.List;

public class MLQScheduler {
    public static void main(String[] args) {
        List<List<Process>> priorityQueues = new ArrayList<>();
        int numQueues = 3; // Number of priority queues

        // Initialize multiple priority queues
        for (int i = 0; i < numQueues; i++) {
            priorityQueues.add(new ArrayList<>());
        }

        priorityQueues.get(0).add(new Process("Process A", 0, 4));
        priorityQueues.get(1).add(new Process("Process B", 1, 7));
        priorityQueues.get(2).add(new Process("Process C", 2, 5));

        for (List<Process> queue : priorityQueues) {
            // Implement the scheduling algorithm for this queue
            runFCFS(queue); // Example: FCFS scheduling
        }
    }

    static class Process {
        String name;
        int priority;
        int executionTime;

        public Process(String name, int priority, int executionTime) {
            this.name = name;
            this.priority = priority;
            this.executionTime = executionTime;
        }
    }

    static void runFCFS(List<Process> processes) {
        // Implement the FCFS scheduling algorithm for this queue
        int currentTime = 0;

        for (Process process : processes) {
            System.out.println("Executing " + process.name + " from time " + currentTime + " to " + (currentTime + process.executionTime));
            currentTime += process.executionTime;
        }
    }
}
