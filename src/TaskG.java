import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int size = (k + 4);

        if (k == 0) {
            System.out.println("NO");
        }
        else if (size % 4 == 0 || k == 1) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
