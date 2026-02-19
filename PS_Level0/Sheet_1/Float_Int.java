import java.util.Scanner;

public class Float_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double exp = sc.nextDouble();

        if (exp == (int) (exp)) {
            System.out.println("int " + (int) (exp));
        } else {
            float decimal =  (float)(exp - (int)(exp));
            System.out.println("float " + (int) (exp)+ " "+ decimal );
        }
    }
}
