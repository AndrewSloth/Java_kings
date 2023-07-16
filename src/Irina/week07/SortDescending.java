package Irina.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortDescending {

    public static Integer[] descendingSortIntArray(int[] arr) {

        List<Integer> arrToList = new ArrayList<>();

        for (int each : arr) {
            arrToList.add(each);
        }

        List<Integer> result = new ArrayList<>();

        while (arrToList.size() > 0) {

            Integer max = -2147483648;

            for (int each : arrToList) {
                if (each > max) {
                    max = each;
                }
            }

            result.add(max);
            arrToList.remove(max);

        }

        return result.toArray(new Integer[0]);

    }

}

/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
 */