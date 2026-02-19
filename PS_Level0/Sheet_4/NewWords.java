package Sheet_4;

import java.util.Scanner;

public class NewWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count_e = 0, count_g = 0, count_y = 0, count_p = 0, count_t = 0, count_egypt = 0;
        char[] array = S.toCharArray();
        for(int i=0; i< array.length ; i++){
            switch (array[i]) {
                case 'e', 'E' -> count_e++;
                case 'g', 'G' -> count_g++;
                case 'y', 'Y' -> count_y++;
                case 'p', 'P' -> count_p++;
                case 't', 'T' -> count_t++;
                default -> {
                }
            }
        }   
        if(count_e == 0 || count_g == 0 || count_y == 0 || count_p == 0 || count_t == 0){
            System.out.println(0);
            
        }else{
        count_egypt = Math.min(count_e, Math.min(count_g, Math.min(count_y, Math.min(count_p, count_t))));
        System.out.println(count_egypt);
        }
       
    }
}
