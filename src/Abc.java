public class Abc {
    public static void main(String[] args) {
        int num = 123456789;
        int numberLength = (int) Math.log10(num) + 1;
        int reverseAnswer = 0;
        for (int i = 0; i < numberLength; i++) {
            int remainder = num % 10;
            reverseAnswer = (reverseAnswer * 10) + remainder;
            num = num / 10;
        }
        System.out.println(reverseAnswer);
    }
}
