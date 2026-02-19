import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1 ; i<=n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum =0;
            
            if(a<=b){
                for(int j = a+1 ; j < b; j++){
                    if(j%2 == 1){
                        sum=sum+j;
                    }
                }
            }else {
                for(int j = b+1 ; j <a; j++){
                    if(j%2 == 1){
                        sum=sum+j;
                    }
                }
            }
            System.out.println(sum);
        }
        
    }
}