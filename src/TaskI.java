import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if (-b % a == 0 && -c * b + a * d != 0) {
                int x = -b / a;
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        }
    }
}