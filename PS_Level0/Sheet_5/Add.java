package Sheet_5;

import java.util.Scanner;

public class Add{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        
        Sum(x,y);
    }
    
    public static void Sum(int x, int y){
        System.out.print(x+y);
    }
}