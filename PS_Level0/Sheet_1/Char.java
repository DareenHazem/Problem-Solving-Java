import java.util.Scanner;

public class Char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        if(c >= 'A' && c <= 'Z'){  // A=65 and Z=90 if(c>=65 && c<=90)
            System.out.print((char)(c + 32));
        }else if(c >= 'a' && c <= 'z'){
            System.out.print((char)(c - 32));
        }
    }
}

/*  
// We didn't use this code cuz Java uses Automatic Type Promotion
so we can directly do c + 32 or c - 32 without casting to int
public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        
        if((int)c <= 90){
            System.out.print((char)((int)c + 32));
        }else{
            System.out.print((char)((int)c - 32));
        }
    }
*/