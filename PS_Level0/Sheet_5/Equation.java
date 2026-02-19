package Sheet_5;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long power = sc.nextLong();
        equation(num, power);
    }

    public static void equation(long n, long p) {
        long sum = 0;
        if (p == 0 || p == 1) {
            System.out.print(sum);
        } else {
            for (int i = 2; i <= p; i = i + 2) {
                long mutltiple = 1;
                int temp = i;
                while (temp-- > 0) {
                    mutltiple = mutltiple * n;
                }
                sum = sum + mutltiple;
            }
            System.out.print(sum);
        }
    }
}
