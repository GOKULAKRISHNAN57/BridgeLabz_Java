package core_programming.strings.Level1;

public class array_index_out_of_bounds_demo {

    public static void generate(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};

        // generate(arr);
        handle(arr);
    }
}
