import java.util.ArrayList;
import java.util.List;

public class BestFitAllocator {
    static class MemoryBlock {
        int size;
        boolean allocated;

        public MemoryBlock(int size) {
            this.size = size;
            this.allocated = false;
        }
    }

    static class Process {
        String name;
        int size;

        public Process(String name, int size) {
            this.name = name;
            this.size = size;
        }
    }

    public static void bestFit(List<MemoryBlock> memory, List<Process> processes) {
        for (Process process : processes) {
            for (MemoryBlock block : memory) {
                if (!block.allocated && block.size >= process.size) {
                    block.allocated = true;
                    System.out.println("Allocated " + process.name + " to memory block of size " + block.size);
                    break;
                }
            }
        }
    }
}
