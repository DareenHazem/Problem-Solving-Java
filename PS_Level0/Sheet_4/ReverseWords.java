package Sheet_4;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] array = S.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = (array[i].length() - 1); j >= 0; j--) {
                System.out.print(array[i].charAt(j));
            }
            if (i != (array.length - 1)) {
                System.out.print(" ");
            }

        }
    }
}
