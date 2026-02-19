import java.util.Scanner;

public class Shape2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int space = N;
        for (int i = 1; i <= N; i++) {

            for (int k = 1; k <space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                
                System.out.print("*");
            }
            space--;
            System.out.println();
        }

    }
}
