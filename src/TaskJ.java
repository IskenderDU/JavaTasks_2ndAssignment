import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int e = c - a;
        int f = d - b;

        if (d < b) {
            f = (100 + d) - b; e = e - 1;
        }
        System.out.println(e + " " + f);
    }
}