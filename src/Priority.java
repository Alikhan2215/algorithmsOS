import java.util.List;
public class Priority {
    String name;
    int priority;
    int executionTime;

    public Priority(String name, int priority, int executionTime) {
        this.name = name;
        this.priority = priority;
        this.executionTime = executionTime;
    }

    public static void runPriority(List<Priority> processes) {
        int currentTime = 0;

        while (!processes.isEmpty()) {
            int highestPriorityIndex = findHighestPriority(processes);

            if (highestPriorityIndex == -1) {
                // No process available to run at this time
                currentTime++;
            } else {
                Priority highestPriorityProcess = processes.remove(highestPriorityIndex);
                // Execute the process
                System.out.println("Executing " + highestPriorityProcess.name + " from time " + currentTime + " to " + (currentTime + highestPriorityProcess.executionTime));
                currentTime += highestPriorityProcess.executionTime;
            }
        }
    }

    public static int findHighestPriority(List<Priority> processes) {
        int highestPriorityIndex = -1;
        int highestPriority = Integer.MAX_VALUE;

        for (int i = 0; i < processes.size(); i++) {
            Priority process = processes.get(i);

            if (process.priority < highestPriority) {
                highestPriorityIndex = i;
                highestPriority = process.priority;
            }
        }

        return highestPriorityIndex;
    }
}
