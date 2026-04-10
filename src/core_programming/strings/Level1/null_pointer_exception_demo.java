package core_programming.strings.Level1;

public class null_pointer_exception_demo {

    public static void generate() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handle() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {
        // generate(); // uncomment to see crash
        handle();
    }
}