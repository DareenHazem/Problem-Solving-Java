package Sheet_3;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum_primary = 0;
        int sum_secondary = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum_primary = arr[i][j] + sum_primary;
                }
            }
            sum_secondary = sum_secondary + arr[i][(arr.length) - i - 1];
        }

        System.out.println(Math.abs(sum_primary - sum_secondary));

    }
}