package Sheet_4;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == ',') {
                System.out.print(' ');
            } else if ('a' <= ch && ch <= 'z') {
                System.out.print((char)(ch - 32)); 
            } else if ('A' <= ch && ch <= 'Z') {
                System.out.print((char)(ch + 32)); 
            }
        }
        System.out.println(); 
    }
}
