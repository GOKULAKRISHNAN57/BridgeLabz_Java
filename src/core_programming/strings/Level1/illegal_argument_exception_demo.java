package core_programming.strings.Level1;

import java.util.*;

public class illegal_argument_exception_demo {

    public static void generate(String s) {
        System.out.println(s.substring(5, 2));
    }

    public static void handle(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument");
        } catch (Exception e) {
            System.out.println("Runtime Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // generate(s);
        handle(s);
    }
}
