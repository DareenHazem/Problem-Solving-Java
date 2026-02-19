package Sheet_3;

import java.util.Scanner;

public class MirrorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][col - j - 1];
                arr[i][col - j - 1] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
                if (j != col - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
