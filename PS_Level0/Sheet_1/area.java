import java.util.Scanner;

public class area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        
        System.out.printf("%.9f", (Math.PI*R*R)); //Math.PI = 3.141592653
        sc.close();
    }
}

