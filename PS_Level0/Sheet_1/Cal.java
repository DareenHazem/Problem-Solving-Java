import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();   

        int a, b;
        char op;

        if (exp.contains("+")) {
            op = '+';
        } else if (exp.contains("-")) {
            op = '-';
        } else if (exp.contains("*")) {
            op = '*';
        } else {
            op = '/';
        }

        int idx = exp.indexOf(op);

        a = Integer.parseInt(exp.substring(0, idx));
        b = Integer.parseInt(exp.substring(idx + 1));

        switch (op) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            default -> System.out.println(a / b);
        }
    }
}

