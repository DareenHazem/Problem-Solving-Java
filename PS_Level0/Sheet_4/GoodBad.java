package Sheet_4;

import java.util.Scanner;

public class GoodBad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
        String S = sc.next();
        if(S.contains("010") || S.contains("101")){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
        }
    }
}
/*
Solution without using contains:
        while(T-- > 0){
            String S = sc.next();
            boolean good = false;
            
            
            for(int i = 0; i <= S.length() - 3; i++){
                String sub = S.substring(i, i + 3);
                if(sub.equals("010") || sub.equals("101")){
                    good = true;
                    break;  
                }
            }
            
            if(good){
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }

*/