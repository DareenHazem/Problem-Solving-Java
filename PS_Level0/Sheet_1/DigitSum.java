
import java.util.Scanner;

public class DigitSum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.print((num1 % 10) + (num2 % 10));
        sc.close();
    }
}
