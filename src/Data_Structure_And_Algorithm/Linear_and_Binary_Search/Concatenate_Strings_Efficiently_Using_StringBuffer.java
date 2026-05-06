package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

public class Concatenate_Strings_Efficiently_Using_StringBuffer {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        String[] array = {"black-","le","g","-","sanji"};

        for (int i = 0; i < array.length; i++) {
            stringBuffer.append(array[i]);
        }

        System.out.println(stringBuffer);
    }
}
