package Sheet_3;

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}

/*  
1- There are another way to reverse the array using a temporary variable

        for (int i = 0; i < N / 2; i++) {
            int temp = array[i];
            array[i] = array[N - 1 - i];
            array[N - 1 - i] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
2- We can also use a stack data structure to reverse the array

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < N; i++) {
            array[i] = stack.pop();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        } 

*/