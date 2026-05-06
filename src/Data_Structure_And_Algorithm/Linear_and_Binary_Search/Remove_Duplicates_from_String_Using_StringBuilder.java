package Data_Structure_And_Algorithm.Linear_and_Binary_Search;

public class Remove_Duplicates_from_String_Using_StringBuilder {

    public static void main(String[] args) {
        String str = "aaabbbbbcbbbbabccaaaaacbcc";
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {

            char character = str.charAt(i);

            if(sb.indexOf(String.valueOf(character)) == -1){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);

    }
}
