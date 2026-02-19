
import java.util.Scanner;

public class FirstDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n / 1000;
        if (n % 2 == 0) {
            System.out.print("EVEN"); 
        }else {
            System.out.print("ODD");
        }

        sc.close();
    }
}
