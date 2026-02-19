package Sheet_4;

import java.util.Arrays;
import java.util.Scanner;

class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SizeOfString = sc.nextInt();
        int NumberOfQueries = sc.nextInt();
        String Query = sc.next();

        while (NumberOfQueries-- > 0) {
            String command= sc.next();
            switch (command) {
                case "pop_back" -> {
                    Query = Query.substring(0, (Query.length() - 1));
                }

                case "front" -> System.out.println(Query.charAt(0));

                case "back" -> System.out.println(Query.charAt(Query.length() - 1));

                case "sort" -> {
                    int start = sc.nextInt();
                    int end = sc.nextInt();

                    String part = Query.substring(start - 1, end);
                    char[] chars = part.toCharArray();
                    Arrays.sort(chars);
                    String sorted_part = new String(chars);
                    Query = Query.substring(0, start - 1) + sorted_part + Query.substring(end);
                }

                case "reverse" -> {
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    String reverse = "";
                    for (int i = end - 1; i >= start - 1; i--) {
                        reverse = reverse + Query.charAt(i);
                    }
                    Query = Query.substring(0, start - 1) + reverse + Query.substring(end);
                }

                case "print" -> {
                    int pos = sc.nextInt();
                    System.out.println(Query.charAt(pos - 1));
                }

                case "substr" -> {
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    Query = Query.substring((start - 1), end);
                    System.out.println(Query);
                }

                case "push_back" -> {
                    char ch = sc.next().charAt(0);
                    Query = Query + ch;
                }

                default -> {
                }
            }
        }
    }
}