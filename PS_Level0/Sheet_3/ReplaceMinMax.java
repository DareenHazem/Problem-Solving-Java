package Sheet_3;

import java.util.Scanner;

public class ReplaceMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int min=arr[0] , max=arr[0];
        int index_min=0, index_max=0;
        for(int i=0; i<n; i++){
            if(min>arr[i]){
                min=arr[i];
                index_min=i;
            }
            
            if(max<arr[i]){
                max=arr[i];
                index_max=i;
            }
        }
        
        int temp=arr[index_max];
        arr[index_max]= arr[index_min];
        arr[index_min]=temp;
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
/*  
We did the min and max starting from the first element of the array,
we could make the loop start from the second element as well 
and it would work fine as we have already assigned the first element to min and max 
so he does not need to compare it with itself.

for(int i=1; i<n; i++)

*/