package Sheet_6;

import java.util.Scanner;

public class PrimeChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N= sc.nextLong();
        

        if(1>=N){
            System.out.print("NO");
        }else{
            for(int i = 2; i<Math.sqrt(N);i++){
                if(N % i == 0){
                 System.out.print("NO");
                 return;
                }
            }
            System.out.print("YES");
        }
    }
}
