
import java.util.HashMap;
import java.util.Map;

class YwoSum {
    public static void main(String[] args) {
     int[] input = new int[]{3,2,4};
        int[] ans = (twoSum(input, 6));
        for(int a: ans){
            System.out.print(a + " ");
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevmap = new HashMap<>();
        for(int i = 0 ; i <= nums.length - 1; i ++){
            int diff = target - nums[i];
            if(prevmap.containsKey(diff)) return new int[]{prevmap.get(diff), i};
            prevmap.put(nums[i], i);
        }
        return new int[]{0,0};
    }


}


        
   

