package Irina.week01;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DivideTwoNumbers {


    public static void divider(double num1, double num2) {

        if (num1 < 0 || num2 <= 0) {
            System.err.println ("Invalid entry");
            System.exit(1);
        }

        double num1Entry = num1;
        int result = 0;
        NumberFormat formatter = new DecimalFormat("#0.00");

        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }

        System.out.println(num1Entry + " : " + num2 + " = " + result + " (reminder: " + formatter.format(num1) + ")");
    }

    public static void main(String[] args) {
        divider(0, 0.25);
    }
}
/*
 Write a method that can divide two numbers without using division operator
 */



