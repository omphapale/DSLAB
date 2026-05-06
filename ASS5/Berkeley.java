import java.util.*;

public class Berkeley {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] time = new int[n];

        // Input time from each node
        for(int i = 0; i < n; i++) {
            System.out.print("Enter time for node " + i + ": ");
            time[i] = sc.nextInt();
        }

        // Step 1: Find average time
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += time[i];
        }

        int avg = sum / n;

        System.out.println("Average time = " + avg);

        // Step 2: Calculate adjustment
        for(int i = 0; i < n; i++) {
            int diff = avg - time[i];
            System.out.println("Node " + i + " should adjust by " + diff);
        }
    }
}
