package Irina.week04;

public class RemoveDuplicates {

    public static String removeDups(String text){

        String result = "";

        for (char eachChar : text.toCharArray()) {

            if (result.contains(eachChar + "")){
                continue;
            }

            result += eachChar + "";

        }

        return result;

    }

}


/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
 */