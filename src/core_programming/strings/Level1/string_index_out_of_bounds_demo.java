package core_programming.strings.Level1;

import java.util.*;

public class string_index_out_of_bounds_demo {

    public static void generate(String s) {
        System.out.println(s.charAt(s.length()));
    }

    public static void handle(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // generate(s);
        handle(s);
    }
}
