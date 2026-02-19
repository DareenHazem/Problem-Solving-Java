package Sheet_6;

import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();

        for (int i = 0; Math.pow(2, i) <= N; i++) {
            if (Math.pow(2, i) == N) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");

    }
}
