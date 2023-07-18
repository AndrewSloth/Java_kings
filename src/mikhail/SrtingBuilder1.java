package mikhail;

public class SrtingBuilder1 {

    public static void main(String[] args) {


        String stringStart = "abcdefghijk";

        StringBuilder str1 = new StringBuilder();

        for (int i = stringStart.length()-1; i >= 0; i--) {
            System.out.println(stringStart.charAt(i));

            str1.append(stringStart.charAt(i));

        }
        System.out.println(str1.toString());
    }

}
