
import java.util.Scanner;

public class Capital_Small_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("ALPHA\nIS CAPITAL");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("ALPHA\nIS SMALL");
        } else if ('0' <= ch && ch <= '9') {
            {
                System.out.println("IS DIGIT");
            }

        }
    }
}
