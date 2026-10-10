import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a>b) {
            System.out.println(a);
        }
        else if (b>a) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}