import java.util.Scanner;

public class EvenOdd_PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int CountEven = 0;
        int CountOdd = 0;
        int CountPos = 0;
        int CountNeg = 0;

        for (int i = 1; i <= N; i++) {

            int n = sc.nextInt();

            if (n % 2 == 0) {
                ++CountEven;
            } else {
                ++CountOdd;
            }

            if (n > 0) {
                ++CountPos;
            } else if (n < 0) {
                ++CountNeg;
            }

        }

        System.out.println(
                "Even: " + CountEven + "\nOdd: " + CountOdd + "\nPositive: " + CountPos + "\nNegative: " + CountNeg);

    }
}