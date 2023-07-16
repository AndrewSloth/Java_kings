package Irina.week03;

public class ReverseNegativeNumber {

    public static int reverseNegativeNum(int num){

        if (num >= 0){

            System.err.println("Enter a negative number.");
            return 0;

        }else{

            int reversed = 0;

            while(num != 0) {

                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;

            }

            return reversed;

        }
    }

}
