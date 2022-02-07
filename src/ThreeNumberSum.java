import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {
        System.out.println(threeNumberSum(new int[] { 12, 3, 1, 2, -6, 5, -8, 6 }, 0));
        List<Integer[]> triplets = threeNumberSum(new int[] { 12, 3, 1, 2, -6, 5, -8, 6 }, 0);


    }

    private static List<Integer[]> threeNumberSum(int[] arrays, int targetSum) {

        Arrays.sort(arrays);

        List<Integer[]> triplets = new ArrayList<Integer[]>();

        for (int i = 0; i < arrays.length - 2; i++) {
            int left = i + 1;
            int right = arrays.length - 1;
            while (left < right) {

                int currentSum = arrays[i] + arrays[left] + arrays[right];
                if (currentSum == targetSum) {
                    Integer[] newTriplet = { arrays[i], arrays[left], arrays[right] };
                    triplets.add(newTriplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else if (currentSum > targetSum) {
                    right--;
                }

            }

        }
        return triplets;
    }

}
