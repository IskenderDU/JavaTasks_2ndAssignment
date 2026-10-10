import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a>b) {
            System.out.println(1);
        }
        else if (b>a) {
            System.out.println(2);
        }
        else {
            System.out.println(0);
        }
    }
}