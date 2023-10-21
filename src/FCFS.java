import java.util.List;

public class FCFS {
    String name;
    int order;
    int executionTime;

    public FCFS(String name, int order, int executionTime) {
        this.name = name;
        this.order = order;
        this.executionTime = executionTime;
    }
    public static void runFCFS(List<FCFS> Fcfses) {
        int currentTime = 0;

        for (FCFS Fcfs : Fcfses) {
            if (Fcfs.order > currentTime) {
                currentTime = Fcfs.order;
            }

            System.out.println("Executing " + Fcfs.name + " from time " + currentTime + " to " + (currentTime + Fcfs.executionTime));
            currentTime += Fcfs.executionTime;
        }
    }
}
