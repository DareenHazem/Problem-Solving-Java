package Sheet_5;

import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        shiftRight(arr, s);
    }

    public static void shiftRight(int[] arr, int s) {
        if (s % arr.length == 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i != arr.length - 1) {
                    System.out.print(" ");
                }
            }
        } else {
            s = s % arr.length;
            for (int i = 0; i < s; i++) {
                int last = arr[arr.length - 1];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[arr.length - 1 - j] = arr[arr.length - 2 - j];
                }
                arr[0] = last;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i != arr.length - 1) {
                    System.out.print(" ");
                }
            }
        }
    }

}
