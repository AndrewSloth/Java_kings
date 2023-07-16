package Irina.week06;

public class PasswordValidation {

    public static boolean VerifyPassword(String passw) {

        int upperCaseCount = 0, lowerCaseCount = 0, specCharCount = 0, digitsCount = 0;

        if (passw.length() < 6 || passw.contains(" ")) {
            System.err.println("Invalid password. Password is less than 6 characters or contains spaces.");
            return false;
        }

        for (char eachChar : passw.toCharArray()) {
            if (Character.isUpperCase(eachChar)) {
                upperCaseCount++;
            }
            if (Character.isLowerCase(eachChar)) {
                lowerCaseCount++;
            }
            if (!Character.isLetterOrDigit(eachChar)) {
                specCharCount++;
            }
            if (Character.isDigit(eachChar)) {
                digitsCount++;
            }

        }

        if (upperCaseCount > 0 && lowerCaseCount > 0 && specCharCount > 0 && digitsCount > 0) {
            System.out.println("Good job! Your password is valid!");
            return true;
        } else {
            System.err.println("Invalid password. Make sure that you have at least one upper case, lower case, special character and digit in your password.");
            return false;
        }


    }


}

/*
Write a return method that can verify if a password is valid or not. Requirements:

Password MUST be at least 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */