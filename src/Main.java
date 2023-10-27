import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // FCFS scheduling algorithm
        List<FCFS> fcfsProcesses = new ArrayList<>();
        fcfsProcesses.add(new FCFS("Process 1", 0, 4));
        fcfsProcesses.add(new FCFS("Process 2", 1, 7));
        fcfsProcesses.add(new FCFS("Process 3", 2, 1));
        fcfsProcesses.add(new FCFS("Process 4", 3, 15));

        System.out.println("FCFS scheduling algorithm start: ");
        System.out.println();
        FCFS.runFCFS(fcfsProcesses);
        System.out.println();
        System.out.println("FCFS scheduling algorithm ended.");

        // SJN scheduling algorithm
        List<SJN> sjnProcesses = new ArrayList<>();
        sjnProcesses.add(new SJN("Process 1", 5));
        sjnProcesses.add(new SJN("Process 2", 1));
        sjnProcesses.add(new SJN("Process 3", 14));
        sjnProcesses.add(new SJN("Process 4", 2));

        System.out.println("SJN scheduling algorithm start: ");
        System.out.println();
        SJN.runSJN(sjnProcesses);
        System.out.println();
        System.out.println("SJN scheduling algorithm ended.");

        // Priority scheduling algorithm
        List<Priority> priorityProcesses = new ArrayList<>();
        priorityProcesses.add(new Priority("Process 1", 2, 4));
        priorityProcesses.add(new Priority("Process 2", 1, 7));
        priorityProcesses.add(new Priority("Process 3", 3, 1));
        priorityProcesses.add(new Priority("Process 4", 4, 15));

        System.out.println("Priority scheduling algorithm start: ");
        System.out.println();
        Priority.runPriority(priorityProcesses);
        System.out.println();
        System.out.println("Priority scheduling algorithm ended.");

        // Shortest Remaining Time scheduling algorithm
        List<SRTF> srtfProcesses = new ArrayList<>();
        srtfProcesses.add(new SRTF("Process 1", 4));
        srtfProcesses.add(new SRTF("Process 2", 7));
        srtfProcesses.add(new SRTF("Process 3", 1));
        srtfProcesses.add(new SRTF("Process 4", 15));

        System.out.println("Shortest Remaining Time scheduling algorithm start: ");
        System.out.println();
        SRTF.runSRTF(srtfProcesses);
        System.out.println();
        System.out.println("Shortest Remaining Time scheduling algorithm ended.");

        // Multiple-Level Queues Scheduling (MLQ)
        List<MLQScheduler.Process> mlqProcesses = new ArrayList<>();
        mlqProcesses.add(new MLQScheduler.Process("Process A", 0, 4));
        mlqProcesses.add(new MLQScheduler.Process("Process B", 1, 7));
        mlqProcesses.add(new MLQScheduler.Process("Process C", 2, 5));

        System.out.println("Multiple-Level Queues Scheduling start: ");
        System.out.println();
        MLQScheduler.runFCFS(mlqProcesses); // Use the appropriate method for MLQ
        System.out.println();
        System.out.println("Multiple-Level Queues Scheduling ended.");


        // Best Fit memory allocation
        List<BestFitAllocator.MemoryBlock> bestFitMemoryBlocks = new ArrayList<>();
        List<BestFitAllocator.Process> bestFitProcesses = new ArrayList<>();

        bestFitMemoryBlocks.add(new BestFitAllocator.MemoryBlock(100));
        bestFitMemoryBlocks.add(new BestFitAllocator.MemoryBlock(200));
        bestFitMemoryBlocks.add(new BestFitAllocator.MemoryBlock(150));

        bestFitProcesses.add(new BestFitAllocator.Process("Process A", 120));
        bestFitProcesses.add(new BestFitAllocator.Process("Process B", 180));

        System.out.println("Best Fit memory allocation start: ");
        System.out.println();
        BestFitAllocator.bestFit(bestFitMemoryBlocks, bestFitProcesses);
        System.out.println();
        System.out.println("Best Fit memory allocation ended.");

        // First Fit memory allocation
        List<FirstFitAllocator.MemoryBlock> firstFitMemoryBlocks = new ArrayList<>();
        List<FirstFitAllocator.Process> firstFitProcesses = new ArrayList<>();

        firstFitMemoryBlocks.add(new FirstFitAllocator.MemoryBlock(100));
        firstFitMemoryBlocks.add(new FirstFitAllocator.MemoryBlock(200));
        firstFitMemoryBlocks.add(new FirstFitAllocator.MemoryBlock(150));

        firstFitProcesses.add(new FirstFitAllocator.Process("Process A", 120));
        firstFitProcesses.add(new FirstFitAllocator.Process("Process B", 180));

        System.out.println("First Fit memory allocation start: ");
        System.out.println();
        FirstFitAllocator.firstFit(firstFitMemoryBlocks, firstFitProcesses);
        System.out.println();
        System.out.println("First Fit memory allocation ended.");
    }
}
