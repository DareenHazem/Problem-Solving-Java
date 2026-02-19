package Sheet_4;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String S = sc.next();
        char [] array = S.toCharArray();
        
        for(int i=0; i< array.length-1 ; i++){
            char min = array[i];
            int index =i;
            for(int j=i+1 ; j< array.length ; j++){
                if(min > array[j]){
                    min=array[j];
                    index=j;
                }
            }
            array[index]=array[i];
            array[i]=min;
        }
        
        System.out.print(array);
    }
}

/*
  Alternative way to sort the string using selection sort algorithm:      
        for (int i = 0; i < num - 1; i++) {
            int index = i;
            for (int j = i + 1; j < num; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            char temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
*/