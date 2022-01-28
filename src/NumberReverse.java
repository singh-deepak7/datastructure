public class NumberReverse {
    public static void main(String[] args) {
        int inputNumber = 123456;
        int result = 0;
        while (inputNumber > 0) {
            result = (result * 10) + inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("Result: " + result);
    }
}
