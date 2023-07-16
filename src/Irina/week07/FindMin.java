package Irina.week07;

public class FindMin {

    public static int minNumberOfIntArray(int[] arr) {

        int min = 2147483647;

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }

}

//Write a method that can find the minimum number from an int Array