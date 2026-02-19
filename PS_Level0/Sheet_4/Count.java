package Sheet_4;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int count = 0;
        char [] array = A.toCharArray();

        for (int i = 0; i < array.length; i++) {
            count= count + (array[i]-'0');
        }
        System.out.println(count);
       
    }
}
/*
count= count + (int)(array[i]-48);
we used (int)array[i] to convert the character to its ASCII value, 
and then we subtracted 48 from it to get the actual integer value of the character (since '0' has an ASCII value of 48). 
We added this value to the count variable for each character in the string, and finally printed the total count.
*/