
import java.util.Scanner;

public class Mathematical_Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String S = sc.next();
        int b = sc.nextInt();
        String Q = sc.next();
        int c = sc.nextInt();

        if (S.equals("+")) {
            if (a + b == c) {
                System.out.println("Yes");
            } else {
                System.out.println(a + b);
            }
        } else if (S.equals("-") ) {
            if (a - b == c) {
                System.out.println("Yes");
            } else {
                System.out.println(a - b);
            }
        } else if (S.equals("*") ) {
           if (a * b == c) {
                System.out.println("Yes");
            } else {
                System.out.println(a * b);
            }
        } else if (S.equals("/") ){
            if (a / b == c) {
                System.out.println("Yes");
            } else {
                System.out.println(a / b);
            }
        } 
    }
}
