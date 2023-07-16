package Irina.week05;

public class FindUnique {

    public static String FindUniqueChars(String str){

        String result = "";

        for (char eachChar : str.toCharArray()) {
            int count = 0;
            for (char each : str.toCharArray()) {
                if (eachChar == each){
                    count++;
                }
            }

            if(count == 1){
                result += eachChar;
            }

        }

        return result;

    }


}

/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */