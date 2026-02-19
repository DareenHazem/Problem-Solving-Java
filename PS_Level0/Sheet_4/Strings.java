package Sheet_4;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + " " + B.length());
        System.out.println(A + B);

        
        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();

        char temp = aChars[0];
        aChars[0] = bChars[0];
        bChars[0] = temp;

        
        A = new String(aChars);
        B = new String(bChars);

        System.out.println(A + " " + B);
    }
}
/*
another sol:
        StringBuilder sbA = new StringBuilder(A);
        StringBuilder sbB = new StringBuilder(B);

        char temp = sbA.charAt(0);
        sbA.setCharAt(0, sbB.charAt(0));
        sbB.setCharAt(0, temp);

        System.out.println(sbA + " " + sbB);

*/