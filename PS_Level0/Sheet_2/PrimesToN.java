import java.util.Scanner;

public class PrimesToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        

        for (int i = 2; i <= N; i++) {
            boolean isprime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(i + " ");
            }
        }

    }
}

