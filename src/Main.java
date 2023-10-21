import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FCFS> Fcfs = new ArrayList<>();
        Fcfs.add(new FCFS("Process 1", 0, 4));
        Fcfs.add(new FCFS("Process 2", 1, 7));
        Fcfs.add(new FCFS("Process 3", 2, 1));
        Fcfs.add(new FCFS("Process 4", 3, 15));
        List<SJN> Sjn = new ArrayList<>();
        Sjn.add(new SJN("Process 1", 5));
        Sjn.add(new SJN("Process 2", 1));
        Sjn.add(new SJN("Process 3", 14));
        Sjn.add(new SJN("Process 4", 2));

        System.out.println("FCFS scheduling algorithm start: ");
        System.out.println();
        FCFS.runFCFS(Fcfs);
        System.out.println();
        System.out.println("FCFS scheduling algorithm ended. ");

        System.out.println("SJN scheduling algorithm start: ");
        System.out.println();
        SJN.runSJN(Sjn);
        System.out.println();
        System.out.println("SJN scheduling algorithm ended. ");
    }
}