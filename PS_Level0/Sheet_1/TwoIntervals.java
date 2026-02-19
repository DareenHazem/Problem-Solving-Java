import java.util.Scanner;

public class TwoIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int max = Math.max(l1, l2);
        int min = Math.min(r1, r2);

        if (max <= min) {
            System.out.print(max + " " + min);
        } else {
            System.out.print(-1);

        }

    }
}
