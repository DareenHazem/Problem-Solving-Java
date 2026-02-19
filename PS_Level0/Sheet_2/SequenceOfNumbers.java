import java.util.Scanner;

public class SequenceOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPositive = true;

      while (isPositive) {
           int x = sc.nextInt();
           int y = sc.nextInt();
           if (x <= 0 || y <= 0) {
               break;
           }

           int max, min, sum = 0;
            if (x <= y) {
                max = y;
                min = x;
            } else {
                max = x;
                min = y;
            }

            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
                sum = sum + i;
            }
            System.out.print("sum =" + sum+"\n");
        } 

    }
}
