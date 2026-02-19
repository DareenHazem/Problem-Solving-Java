package Sheet_4;

import java.util.Scanner;
 
public class Getline_FirstAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String[] parts = A.split("\\\\");
        System.out.println(parts[0]);
        
    }
}
// The above code reads a line of input from the user, splits it by the backslash character, and prints the first part of the split string.
//getline is in C++ => in Java we use nextLine() to read a line of input from the user.
/*
We used 4 backslashes in the split method because the backslash is an escape character in Java.
To represent a single backslash in a string, we need to escape it with another backslash. 
and since we want to split by a single backslash, we need to escape it again in the regular expression Regex, resulting in four backslashes: "\\\\".
*/
