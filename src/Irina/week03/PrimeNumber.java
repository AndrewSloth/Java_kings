package Irina.week03;

public class PrimeNumber {

    public static void primeOrNot(int num){

        if(num <= 1){
            System.err.println("Please enter the number greater than 1.");
        }else{

            for (int i = 2; i < num; i++) {

                if (num % i == 0){
                    System.out.println(num + " is not a prime number");
                    System.exit(1);
                }
            }
            System.out.println(num + " is a prime number");
        }

    }

}
