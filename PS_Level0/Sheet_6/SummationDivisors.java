package Sheet_6;

import java.util.Scanner;

public class SummationDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0;
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += (N / i);
                }
            }
        }
        System.out.println(sum);
    }
}
