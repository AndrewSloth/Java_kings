package Irina.week05;

public class ReverseString {

    public static String ReverseStr(String str){

        String result = "";

        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }


}

/*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */