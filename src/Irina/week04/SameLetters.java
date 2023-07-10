package Irina.week04;

import java.util.Arrays;
import java.util.Collections;

public class SameLetters {

    public static boolean sameLettersOrNot(String text1, String text2){

        boolean result = false;

        String[] arr1 = text1.split("");
        String[] arr2 = text2.split("");

        Collections.sort(Arrays.asList(arr1));
        Collections.sort(Arrays.asList(arr2));
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        if (Arrays.equals(arr1, arr2)){
            result = true;
        }

        return result;
    }

}

/*
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */