package Sheet_3;

import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] a = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            long min = Long.MAX_VALUE;

            for (int k = 0; k < N; k++) {
                for (int j = k + 1; j < N; j++) {
                    long sum = (long) a[k] + a[j] + (j - k);
                    if (sum < min) {
                        min = sum;
                    }
                }
            }

            System.out.println(min);
        }
    }
}
