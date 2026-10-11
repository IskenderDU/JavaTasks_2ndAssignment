import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int time;

        if (n <= k) {
            time = 2 * m;
        }
        else {
            time = (2 * n + k - 1) / k * m;
        }

        System.out.println(time);
    }
}