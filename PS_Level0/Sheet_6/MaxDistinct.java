package Sheet_6;

import java.util.Scanner;

public class MaxDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num= sc.nextLong();
        //int index=1;
        long ans = (long)((-1 + Math.sqrt(8.0*num + 1)) / 2);
        System.out.println(ans);
    }
}
