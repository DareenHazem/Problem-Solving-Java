package Sheet_5;

import java.util.Scanner;

public class WonderfulNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        wonderful(x);
    }

    public static void wonderful(long N) {
        boolean is_odd = false;
        boolean is_palindrome = true;
        
        if(N %2 == 1){
           is_odd=true; 
        }
        String binary = Long.toBinaryString(N);
        char [] array = binary.toCharArray();
        for(int i = 0; i< (array.length /2) ; i++){
            if(array [i] != array[(array.length-1)-i]){
                is_palindrome = false;
                break;
            }
        }
        if(is_odd && is_palindrome){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}

/*  
we can solve it without making the array and just by the charAt() method of the string 
        String bin = Long.toBinaryString(N);
        int len = bin.length();
        for(int i = 0; i < len / 2; i++) {
            if(bin.charAt(i) != bin.charAt(len - 1 - i)) return false;
        }
*/