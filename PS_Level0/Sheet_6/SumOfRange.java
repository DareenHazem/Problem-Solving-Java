package Sheet_6;

import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min= Math.min(a, b);
        int max=Math.max(a, b);
        long sum = 0, sum_even = 0, sum_odd = 0;

        sum= ((max*(max+1))/2 )-(((min-1)*(min))/2 );
        
        long firstEven = (min % 2 == 0) ? min : min + 1;
        long lastEven = (max % 2 == 0) ? max : max - 1;

        
        

        System.out.println(sum);
        System.out.println(sum_even);
        System.out.println(sum_odd);

    }
}
