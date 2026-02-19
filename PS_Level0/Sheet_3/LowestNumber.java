package Sheet_3;
import java.util.Scanner;
public class LowestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        
        
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        
        
        int min=array[0];
        int index=0;
        for (int i = 0; i < N; i++) {
            if( min > array[i]) {
                min=array[i];
                index = i;
            }
        }
        
        System.out.print(min+" "+(index+1));
    }
}
