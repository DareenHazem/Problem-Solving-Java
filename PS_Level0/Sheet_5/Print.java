package Sheet_5;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print(x);
    }

    public static void print(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
            if (i != N) {
                System.out.print(" ");
            }
        }

    }
}