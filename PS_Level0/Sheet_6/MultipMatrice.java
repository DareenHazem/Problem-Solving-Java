package Sheet_6;

import java.util.Scanner;

public class MultipMatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_row = sc.nextInt();
        int A_col = sc.nextInt();
        long[][] arr1 = new long[A_row][A_col];
        for (int i = 0; i < A_row; i++) {
            for (int j = 0; j < A_col; j++) {
                arr1[i][j] = sc.nextLong();
            }
        }

        int B_row = sc.nextInt();
        int B_col = sc.nextInt();
        long[][] arr2 = new long[B_row][B_col];
        for (int i = 0; i < B_row; i++) {
            for (int j = 0; j < B_col; j++) {
                arr2[i][j] = sc.nextLong();
            }
        }
        multiply(arr1, A_row, A_col, arr2, B_row, B_col);
    }

    public static void multiply(long[][] arr1, int A_row, int A_col, long[][] arr2, int B_row, int B_col) {
        if (A_col != B_row) {
            System.out.println("Cannot multiply matrices!");
            return;
        }

        long[][] result = new long[A_row][B_col]; 

        for (int i = 0; i < A_row; i++) {
            for (int j = 0; j < B_col; j++) { 
                long sum = 0;
                for (int k = 0; k < A_col; k++) { 
                    sum += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = sum;
            }
        }

        for (int i = 0; i < A_row; i++) {
            for (int j = 0; j < B_col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
