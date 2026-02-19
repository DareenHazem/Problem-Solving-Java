import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // floor
        System.out.printf("floor %d / %d = %d\n", a, b,(a / b));
        // ceil
        int ceil= (int) Math.ceil((float)(a)/ (float)(b));
        System.out.printf("ceil %d / %d = %d\n", a, b,ceil);
        // round
        int round = Math.round((float)(a)/ (float)(b));
         System.out.printf("round %d / %d = %d\n", a, b,round);

    }
}
