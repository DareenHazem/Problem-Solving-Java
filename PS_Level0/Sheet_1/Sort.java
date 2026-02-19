import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int min,max,mid ;

    if (a >= b && a >= c) {
        max = a;
        if (b >= c) {
            mid = b;
            min = c;
        } else {
            mid = c;
            min = b;
        }
    } else if (b >= a && b >= c) {
        max = b;
        if (a >= c) {
            mid = a;
            min = c;
        } else {
            mid = c;
            min = a;
        }
    } else {
        max = c;
        if (a >= b) {
            mid = a;
            min = b;
        } else {
            mid = b;
            min = a;
        }
    }

    System.out.println(min);
    System.out.println(mid);
    System.out.println(max +"\n");  
    System.out.println(a);
    System.out.println(b);  
    System.out.println(c); 
    }
}
