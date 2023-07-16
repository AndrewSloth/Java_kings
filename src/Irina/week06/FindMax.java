package Irina.week06;

public class FindMax {

    public static int maxNumberOfIntArray(int[] arr) {

        int max = -2147483648;

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;

    }

}

//Write a method that can find the maximum number from an int Array