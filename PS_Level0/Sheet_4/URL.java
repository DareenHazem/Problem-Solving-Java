package Sheet_4;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String query = s.substring(s.indexOf('?') + 1);
        String[] params = query.split("&");
        for (String p : params) {
            String[] kv = p.split("=");
            System.out.println(kv[0] + ": " + kv[1]);
        }
    }
}
