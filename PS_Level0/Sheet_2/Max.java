import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        for(int i= 1; i<=N; i++){
            int n = sc.nextInt();
            if(max<n)
            {
                max= n;
            }
        }
        System.out.println(max);
    }
}

/*
There was a problem in the for loop
I made the loop run one extra time and it was giving an error 
because it tried to read an integer that was not there 
ex: if N is 5, the loop should run from 1 to 5, but I had it running from 1 to 6, which caused an error when it tried to read the 6th integer that does not exist.
The error was "java.util.NoSuchElementException: No line found" because it tried to read an integer that was not there.
*/