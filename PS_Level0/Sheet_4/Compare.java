package Sheet_4;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int compare = A.compareToIgnoreCase(B);
        if (compare < 0 || compare == 0) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}

