package Sheet_5;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long x = sc.nextLong();
            prime(x);
        }
    }

    public static void prime(long x) {
        boolean is_prime = true;

        if (x <= 1) {
            is_prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    is_prime = false;
                    break;
                }
            }
        }
        if (is_prime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}