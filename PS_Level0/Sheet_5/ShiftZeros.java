package Sheet_5;

import java.util.Scanner;

public class ShiftZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        shiftZeros(arr);
    }
   public static void shiftZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != (arr.length - 1)) {
                System.out.print(" ");
            }
        }
    }

}
