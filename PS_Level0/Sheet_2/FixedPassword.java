import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        boolean Correct = false;

        while (!Correct) {
            Scanner sc = new Scanner(System.in);
            int password = sc.nextInt();
            if (password == 1999) {
                System.out.println("Correct");
                Correct = true;
            } else {
                System.out.println("Wrong");
            }

        }
    }

}