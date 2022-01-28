public class CountNumber {
    public static void main(String[] args) {
        int inputNumber = 123456;
        System.out.println((int) Math.log10(inputNumber) + 1);

        int count = 0;
        while(inputNumber > 0){
            inputNumber /= 10;
            count++;
        }
        System.out.println("Other way to count " + count);
    }
}
