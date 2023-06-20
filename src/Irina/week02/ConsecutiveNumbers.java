package Irina.week02;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

        int n = 100;
        String divisibleBy2 = "Codility";
        String divisibleBy3 = "Test";
        String divisibleBy5 = "Coders";

        for (int i = 1; i < n+1; i++) {

            if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println(divisibleBy2 + divisibleBy3 + divisibleBy5);
            }else if (i % 2 == 0 && i % 3 == 0){
                System.out.println(divisibleBy2 + divisibleBy3);
            }else if (i % 2 == 0 && i % 5 == 0){
                System.out.println(divisibleBy2 + divisibleBy5);
            }else if (i % 2 == 0){
                System.out.println(divisibleBy2);
            }else if (i % 3 == 0 && i % 5 == 0){
                System.out.println(divisibleBy3 + divisibleBy5);
            }else if (i % 3 == 0){
                System.out.println(divisibleBy3);
            }else if (i % 5 == 0){
                System.out.println(divisibleBy5);
            }else{
                System.out.println(i);
            }
        }

    }
}

/*
int a = 1; (positive)
1 > N
each on separate line
divisibleBy2 -> Codility
divisibleBy3 -> Test
divisibleBy5 -> Coders
 */
