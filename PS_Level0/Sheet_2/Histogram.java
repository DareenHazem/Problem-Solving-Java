import java.util.Scanner;

public class Histogram{

    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = sc.nextInt();
        
        for(int i = 1 ; i<=N ; i++){
            int num = sc.nextInt();
            for(int j = 1; j<= num ; j++){
                System.out.print(S);
            }
            System.out.println();
        }
        
    }
    
}