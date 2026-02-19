package Sheet_5;

import java.util.Scanner;

public class NTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            char c =sc.next().charAt(0);
            n_times(c,x);
        }
    }
    public static void n_times(char ch, int num){
        for(int i =1 ; i<=num ;i++){
            System.out.print(ch);
            
            if(i != num){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
}
