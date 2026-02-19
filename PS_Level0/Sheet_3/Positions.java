package Sheet_3;
import java.util.Scanner;

public class Positions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if( 10 >= array[i]) {
                System.out.printf("A[%d] = %d\n",i,array[i]);
            }
        }
    }
}
