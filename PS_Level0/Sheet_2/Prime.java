import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        boolean isprime = true;

        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
