package Sheet_3;

 
import java.util.Scanner;
 
public class Replacement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
 
    for (int i = 0; i < N; i++) {
      array[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      if( 0 < array[i]) {
        array[i] = 1;
      } else if (array[i] < 0) {
        array[i] = 2;
      }
    }
    for (int i = 0; i < N; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
