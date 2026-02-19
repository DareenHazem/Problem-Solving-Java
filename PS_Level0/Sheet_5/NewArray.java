package Sheet_5;

import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        newarray(arr1, arr2);
    }

    public static void newarray(int[] arr1, int[] arr2) {
        int[] newarray = new int[(arr1.length) * 2];

        for (int i = 0; i < arr1.length; i++) {
            if (i == (arr1.length - 1)) {
                newarray[i] = arr2[arr1.length - 1];
                int index = 0;
                for (int j = arr1.length; j < newarray.length; j++) {
                    newarray[j] = arr1[index];
                    index++;
                }
                break;
            }
            newarray[i] = arr2[i];
        }


        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i]);
            if (i != (newarray.length - 1)) {
                System.out.print(" ");
            }
        }


    }

}
/*
There is an easier way to solve this problem :

// أول N عناصر من B
for (int i = 0; i < arr2.length; i++) {
    newarray[i] = arr2[i];
}

// من N لآخر array نحط A
for (int i = 0; i < arr1.length; i++) {
    newarray[i + arr2.length] = arr1[i];
}
اللوب الأولى: بتملأ من index 0 لحد N-1

اللوب التانية: بتكمل من index N لحد آخر الـ newarray

*/