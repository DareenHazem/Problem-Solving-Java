package Sheet_5;

import java.util.Scanner;

public class FiveInOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        max(arr1);
        min(arr1);
        prime(arr1);
        palindrome(arr1);
        divisors(arr1);
    }

    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum number : " + max);
    }

    public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum number : " + min);
    }

    public static void prime(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            boolean isPrime = true;
            if (arr[i] <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }
        System.out.println("The number of prime numbers : " + count);
    }

    public static void palindrome(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }
            if (rev == arr[i]) {
                count++;
            }
        }
        System.out.println("The number of palindrome numbers : " + count);
    }

    public static void divisors(int[] arr) {
        int index = arr[0];
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
                if(max< count){
                    max=count;
                    index=arr[i];
                }
                if(max == count){
                    index=Math.max(index,arr[i]);
                }
        }
        System.out.println("The number that has the maximum number of divisors : " + index);
        
    }
}