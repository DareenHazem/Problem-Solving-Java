package Sheet_4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        for (int i = 0; i < (A.length() / 2); i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
