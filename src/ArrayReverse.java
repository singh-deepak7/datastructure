import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int inputArray[] = new int[]{1,2,3,4};
        System.out.println("Before");
        Arrays.stream(inputArray).forEach(x -> System.out.print(x + " "));
        reverse(inputArray, 0, inputArray.length-1);

    }

    private static void reverse(int[] inputArray, int left, int right) {
        while (left < right){
            int temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left++;
            right--;
        }
        System.out.println("\nAfter");
        Arrays.stream(inputArray).forEach(x -> System.out.print(x + " "));
    }
}
