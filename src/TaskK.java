import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 3;
        int b = 5;
        int k = in.nextInt();

        if (k < 8 && k != 3 && k != 5 && k !=6) {
            System.out.println("NO");
        }
        else if ((k - b) % a == 0 || (k - a) % b == 0 || (k % a) % b == 0 || (k % b) % a == 0 || (k >= 8 && (k - b) % a == 0) || (k >= 13 && (k - 2 * b) % a == 0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
