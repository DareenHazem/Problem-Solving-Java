import java.util.Scanner;

public class Last2Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long multip1 = ((a % 100) * (b % 100)) % 100;
        long multip2 = ((c % 100) * (d % 100)) % 100;
        long final_ans = (multip1 * multip2) % 100;
        if (final_ans == 0 || (final_ans<10)) {
            System.out.print(0);
        }
        System.out.println(final_ans);

    }
}
