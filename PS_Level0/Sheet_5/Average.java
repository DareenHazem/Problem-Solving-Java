package Sheet_5;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        average(arr);
    }
    public static void average(double[] arr) {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        double avg = sum / arr.length;
        System.out.printf("%.7f", avg);
        
    }
}
