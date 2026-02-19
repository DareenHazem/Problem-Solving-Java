import java.util.Scanner;

public class Comparsion {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String S = sc.next();
        int B = sc.nextInt();

        boolean isRight = false;

        if (S.equals("=") && A == B) {
            isRight = true;
        } else if (S.equals(">") && A > B) {
            isRight = true;
        } else if (S.equals("<") && A < B) {
            isRight = true;
        }

        if (isRight) {
            System.out.print("Right");
        } else {
            System.out.print("Wrong");
        }
    }
}

