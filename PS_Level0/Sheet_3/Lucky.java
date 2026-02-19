package Sheet_3;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for(int i = 0; i < N; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            if (min == array[i]) {
                count++;
            }
        }

        if(count % 2 == 1) {
            System.out.print("Lucky");
        } else {
            System.out.print("Unlucky");
        }
    }
}

/*      
1- We can also find the minimum and count the occurrences in a single loop
int min = array[0];
int count = 1;

for (int i = 1; i < N; i++) {
    if (array[i] < min) {
        min = array[i];
        count = 1;
    } else if (array[i] == min) {
        count++;
    }
}

*/