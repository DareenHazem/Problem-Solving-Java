import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int year = 0, mon = 0, day = 0;
            year = age/365;  
            mon = (age - (year *365))/30;
            day = (age - (year *365))%30;

        System.out.println(year + " years");
        System.out.println(mon + " months");
        System.out.println(day + " days");

        sc.close();
    }
}
