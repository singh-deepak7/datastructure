

import java.util.Arrays;

public class TwoNumberSum {

    public static void main(String[] args) {
        //System.out.println(twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10).toString());
        int[] twoNumberSum = twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);


        for(int t: twoNumberSum) {
            System.out.print(t + "");
            System.out.println();
        }

    }

    public static int[] twoNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int currentSum = array[left] + array [right];
            if(targetSum == currentSum) {
                return new int[] {array[left], array[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else if( currentSum > targetSum) {
                right--;
            }

        }
        return new int[0];

    }

}
