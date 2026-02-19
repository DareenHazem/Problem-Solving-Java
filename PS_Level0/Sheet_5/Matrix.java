package Sheet_5;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        matrix(matrix, X, Y);
    }

    public static void matrix(int[][] matrix, int X, int Y) {
        int[] temp1 = matrix[X - 1];
        matrix[X - 1] = matrix[Y - 1];
        matrix[Y - 1] = temp1;

        for (int i = 0; i < matrix.length; i++) {
            int temp2 = matrix[i][X - 1];
            matrix[i][X - 1] = matrix[i][Y - 1];
            matrix[i][Y - 1] = temp2;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}