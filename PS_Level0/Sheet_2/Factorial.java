import java.util.Scanner;
 
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 1; i<=num; i++){
            int f = sc.nextInt();
            long fact = 1;
 
            if(f == 0){
                System.out.println(fact);
                continue;
            }
            for(int j = 1 ; j<=f ; j++){
                fact = fact * j;
            }
          System.out.println(fact);
        }
    }
}