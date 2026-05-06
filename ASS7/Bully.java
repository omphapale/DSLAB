import java.util.*;

public class Bully {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] processes = new int[n];

        for(int i = 0; i < n; i++) {
            processes[i] = i + 1; // IDs
        }

        System.out.print("Enter failed process: ");
        int failed = sc.nextInt();

        System.out.println("Process " + failed + " failed");

        int newLeader = -1;

        for(int i = failed; i < n; i++) {
            System.out.println("Process " + processes[i] + " sends election message");
            newLeader = processes[i];
        }

        System.out.println("New Leader is Process " + newLeader);
    }
}
