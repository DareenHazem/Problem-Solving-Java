package Sheet_4;

import java.util.Scanner;

public class Getline_SecondAnswer {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\\') {
                break;
            }
            System.out.print(s.charAt(i));
        }
    }
}

/*
This code reads a line of input from the user and iterates through each character of the string until it encounters a backslash ('\\').
When it finds a backslash, it breaks out of the loop. Otherwise, it prints the character to the console.
*/

/*
Third solution:

import java.util.Scanner;
public class Getline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // اقرأ السطر كله من المستخدم
        String s = sc.nextLine();

        // اعرف مكان أول backslash
        int idx = s.indexOf('\\');
        
        1-
        // اطبع كل النص من البداية لحد العلامة (مش شاملة backslash)
        System.out.println(s.substring(0, idx));
          
        2-
        *or*
        String part = s.substring(0,idx);
        System.out.println(part);
    }
}

*/