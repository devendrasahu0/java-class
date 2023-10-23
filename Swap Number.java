public class SwapNumbers {

    // Function to swap two numbers using a third variable
    public static void swapWithTempVar(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping with temp variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);

        swapWithTempVar(num1, num2);
    }
}
