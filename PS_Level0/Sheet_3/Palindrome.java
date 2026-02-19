package Sheet_3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int array_reverse[] = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            array_reverse[N - 1 - i] = array[i];
        }

        for (int i = 0; i < N; i++) {
            if (array[i] != array_reverse[i]) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
/*  
1- We can also check if the array is a palindrome without using an extra array

        for (int i = 0; i < N / 2; i++) {
            if (array[i] != array[N - 1 - i]) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
2- We can also use a stack data structure to check if the array is a palindrome

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < N; i++) {
            if (array[i] != stack.pop()) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
*/