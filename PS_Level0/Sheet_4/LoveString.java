package Sheet_4;

import java.util.Scanner;

public class LoveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String A = sc.next();
            String B = sc.next();

            if (A.length() < B.length()) {
                for (int i = 0; i < A.length(); i++) {
                    System.out.print(A.charAt(i) + "" + B.charAt(i));
                }
                System.out.print(B.substring(A.length()));
            } else if (A.length() > B.length()) {
                for (int i = 0; i < B.length(); i++) {
                    System.out.print(A.charAt(i) + "" + B.charAt(i));
                }
                System.out.print(A.substring(B.length()));
            } else {
                for (int i = 0; i < A.length(); i++) {
                    System.out.print(A.charAt(i) + "" + B.charAt(i));
                }
            }
            System.out.println();
        }

    }
}

/*  
      Another solution:() 
        while (n-- > 0) {
            String A = sc.next();
            String B = sc.next();

            int len = Math.max(A.length(), B.length());

            for (int i = 0; i < len; i++) {
                if (i < A.length()) {
                    System.out.print(A.charAt(i));
                }
                if (i < B.length()) {
                    System.out.print(B.charAt(i));
                }
            }
            System.out.println();
        }

*/