package Irina.week03;

public class FrequencyOfChars {

    public static String frequencyOfCharacters(String text){

        String result = "";

        for (char eachChar : text.toCharArray()) {
            if (result.contains(eachChar + "")){
                continue;
            }
            int count = 0;

            for (char eachChar2 : text.toCharArray()) {

                if (eachChar == eachChar2){
                    count++;
                }


            }

            result += eachChar + "" + count;

        }

        return result;

    }


}
/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */