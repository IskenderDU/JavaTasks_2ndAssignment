import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int ax = Math.abs(x1-x2);
        int by = Math.abs(y1-y2);

        if ((ax == 1 && by == 2) || (ax == 2 && by == 1)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}