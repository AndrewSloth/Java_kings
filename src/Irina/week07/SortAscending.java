package Irina.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAscending {

    public static Integer[] ascendingSortIntArray(int[] arr) {

        List<Integer> arrToList = new ArrayList<>();

        for (int each : arr) {
            arrToList.add(each);
        }

        List<Integer> result = new ArrayList<>();

        while (arrToList.size() > 0) {

            Integer min = 2147483647;

            for (int each : arrToList) {
                if (each < min) {
                    min = each;
                }
            }

            result.add(min);
            arrToList.remove(min);

        }

        return result.toArray(new Integer[0]);

    }


}

/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */