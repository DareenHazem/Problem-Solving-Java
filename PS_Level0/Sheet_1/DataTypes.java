
import java.util.Scanner;

public class DataTypes {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = sc.nextLong();
        char c = sc.next().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();

        System.out.println(n);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
        sc.close();
    }
}
