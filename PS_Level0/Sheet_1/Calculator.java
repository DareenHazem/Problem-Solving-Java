
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        System.out.printf("%d + %d = %d\n", x, y, (x + y));
        System.out.printf("%d * %d = %d\n", x, y, (x * y));
        System.out.printf("%d - %d = %d\n", x, y, (x - y));
        sc.close();
    }
}
