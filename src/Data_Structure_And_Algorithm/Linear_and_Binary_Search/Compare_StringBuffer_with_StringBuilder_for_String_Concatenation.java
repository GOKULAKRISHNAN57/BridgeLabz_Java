package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

public class Compare_StringBuffer_with_StringBuilder_for_String_Concatenation {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        long n = 1_000_000;

        long startTimeForStringBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuffer.append("hello");
        }

        long endTimeForStringBuffer = System.nanoTime();

        System.out.println("Time taken for StringBuffer: "
                + (endTimeForStringBuffer - startTimeForStringBuffer) + " ns");


        StringBuilder stringBuilder = new StringBuilder();

        long startTimeForStringBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuilder.append("hello");
        }

        long endTimeForStringBuilder = System.nanoTime();

        System.out.println("Time taken for StringBuilder: "
                + (endTimeForStringBuilder - startTimeForStringBuilder) + " ns");



    }
}
