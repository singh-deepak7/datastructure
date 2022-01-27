public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        System.out.println(factorial(input));
    }

    private static int factorial(int input) {
        if (input == 0) return 1;
        return input * factorial(input - 1);
    }
}
