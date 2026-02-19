package Sheet_3;

 
import java.util.Scanner;
 
public class Searching {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
 
    for (int i = 0; i < N; i++) {
      array[i] = sc.nextInt();
    }
 
    int key = sc.nextInt();

    for (int i = 0; i < N; i++) {
      if(key == array[i]) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}
