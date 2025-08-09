package tandemloop1;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int limit;
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        for (int i = 1; i <= limit * 2; i += 2) {
            System.out.print(i);
            if (i < limit * 2 - 1) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
