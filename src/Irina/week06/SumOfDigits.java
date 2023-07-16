package Irina.week06;

public class SumOfDigits {

    public static int sumOfDigitsInString(String str) {

        int result = 0;
        int eachDigit = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                result += Character.getNumericValue(each);
            }
        }

        return result;

    }


}

//Write a method that can return the sum of the digits in a string