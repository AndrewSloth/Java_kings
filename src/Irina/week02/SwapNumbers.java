package Irina.week02;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 17;
        int b = 28;

        b -= a;
        a += b;
        b = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
