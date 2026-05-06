import java.util.*;

public class Ring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] processes = new int[n];

        for(int i = 0; i < n; i++) {
            processes[i] = i + 1;
        }

        System.out.print("Enter starting process: ");
        int start = sc.nextInt();

        int max = start;

        System.out.println("Election message passing:");

        for(int i = 0; i < n; i++) {
            int id = processes[(start + i) % n];
            System.out.println("Process " + id + " passes message");

            if(id > max) {
                max = id;
            }
        }

        System.out.println("New Leader is Process " + max);
    }
}