import java.util.List;

public class SRTF {
    String name;
    int remainingTime;

    public SRTF(String name, int executionTime) {
        this.name = name;
        this.remainingTime = executionTime;
    }

    public static void runSRTF(List<SRTF> processes) {
        int currentTime = 0;

        while (!processes.isEmpty()) {
            int shortestIndex = findShortestRemainingTime(processes, currentTime);

            if (shortestIndex == -1) {
                // No process available to run at this time
                currentTime++;
            } else {
                SRTF shortestProcess = processes.get(shortestIndex);
                System.out.println("Executing " + shortestProcess.name + " from time " + currentTime + " to " + (currentTime + 1));
                shortestProcess.remainingTime--;

                if (shortestProcess.remainingTime == 0) {
                    processes.remove(shortestIndex);
                }

                currentTime++;
            }
        }
    }

    public static int findShortestRemainingTime(List<SRTF> processes, int currentTime) {
        int shortestIndex = -1;
        int shortestTime = Integer.MAX_VALUE;

        for (int i = 0; i < processes.size(); i++) {
            SRTF process = processes.get(i);

            if (process.remainingTime > 0 && process.remainingTime < shortestTime) {
                shortestIndex = i;
                shortestTime = process.remainingTime;
            }
        }

        return shortestIndex;
    }
}
