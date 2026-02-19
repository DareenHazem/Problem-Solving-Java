import java.util.Scanner;

public class GCD {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max = 1;

        if (A <= B) {
            for (int i = 1; i <= A; i++) {
                if (A % i == 0 && B % i == 0) {
                    max = i;
                }
            }
        } else {
            for (int i = 1; i <= B; i++) {
                if (A % i == 0 && B % i == 0) {
                    max = i;
                }
            }
        }

        System.out.print(max);
    }
}

/*
we could also not use if else and just loop till any number A or B
            for (int i = 1; i <= A or B; i++) {
                if (A % i == 0 && B % i == 0) {
                    max = i;
                }
            }
I did if else to reduce number of iterations
*/