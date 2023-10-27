import java.util.List;

public class SJN {
    String name;
    int executionTime;

    public SJN(String name, int executionTime) {
        this.name = name;
        this.executionTime = executionTime;
    }

    public static void runSJN(List<SJN> SJNes) {
        int currentTime = 0;

        while (!SJNes.isEmpty()) {
            int shortestIndex = findShortestJob(SJNes, currentTime);

            if (shortestIndex == -1) {
                // No job is available to run at this time
                currentTime++;
            } else {
                SJN shortestJob = SJNes.remove(shortestIndex);
                // Execute the process
                System.out.println("Executing " + shortestJob.name + " from time " + currentTime + " to " + (currentTime + shortestJob.executionTime));
                currentTime += shortestJob.executionTime;
            }
        }
    }

    public static int findShortestJob(List<SJN> SJNes, int currentTime) {
        int shortestIndex = -1;
        int shortestTime = Integer.MAX_VALUE;

        for (int i = 0; i < SJNes.size(); i++) {
            SJN Sjn = SJNes.get(i);

            if (Sjn.executionTime <= currentTime && Sjn.executionTime < shortestTime) {
                shortestIndex = i;
                shortestTime = Sjn.executionTime;
            }
        }

        return shortestIndex;
    }
}
