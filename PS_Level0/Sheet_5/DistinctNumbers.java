package Sheet_5;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        distinct(arr);
    }

    public static void distinct(int[] arr) {
        int[] new_array = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (new_array[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                new_array[index] = arr[i];
                index++;
            }
        }
        System.out.println(index);

    }
}
