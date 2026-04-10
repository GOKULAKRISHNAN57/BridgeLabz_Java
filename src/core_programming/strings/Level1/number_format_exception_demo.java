package core_programming.strings.Level1;

import java.util.*;

public class number_format_exception_demo {

    public static void generate(String text) {
        int n = Integer.parseInt(text);
        System.out.println(n);
    }

    public static void handle(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        } catch (Exception e) {
            System.out.println("Runtime Error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        handle(text);
    }
}
