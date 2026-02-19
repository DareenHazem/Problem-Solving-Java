
import java.util.Scanner;

public class CoordinatesofPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        } else if(x == 0){
            System.out.println("Eixo Y");
        } else if(y == 0){
            System.out.println("Eixo X");
        } else if(x > 0 && y > 0){
            System.out.println("Quadrant 1");
        } else if(x < 0 && y > 0){
            System.out.println("Quadrant 2");
        } else if(x < 0 && y < 0){
            System.out.println("Quadrant 3");
        } else {
            System.out.println("Quadrant 4");
        }

        sc.close();
    }
}
