package Sheet_3;

import java.util.Scanner;

public class CheckCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int size=A+B+1;
        char[]arr = new char[size];
        
        String s = sc.next();    
        for (int i = 0; i < size; i++){
             arr[i] = s.charAt(i);
        }
        
        if(arr[A]=='-' ){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
/*
1- a b c d e
char[] arr = new char[size];
for (int i = 0; i < size; i++) {
    arr[i] = sc.next().charAt(0);
}

2- abcde
int size = sc.nextInt();
char[] arr = new char[size];

String s = sc.next();   // نقرأ الكلمة مرة واحدة

for (int i = 0; i < size; i++) {
    arr[i] = s.charAt(i);
}


*/