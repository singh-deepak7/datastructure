public class Fibonacci {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(fib(num));

    }

    private static int fib(int num) {
        if (num <= 1) return num;
        return fib(num - 1) + fib(num - 2);

    }
}
