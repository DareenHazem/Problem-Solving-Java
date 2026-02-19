package Sheet_3;
import java.util.Scanner;
 
public class Summation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
    long sum = 0;
 
    for (int i = 0; i < N; i++) {
      array[i] = sc.nextInt();
    }
 
    for (int i = 0; i < N; i++) {
      sum = array[i] + sum;
    }
 
    if (sum < 0) {
      sum = -sum;
    }
    System.out.println(sum);
  }
}
