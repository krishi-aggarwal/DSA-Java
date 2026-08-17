    package Leetcode;

    import java.util.Arrays;
import java.util.HashMap;

    // 1.two sum
    public class P0001 {

        public static int[] twoSum(int[] nums , int target){
            HashMap<Integer,Integer> hm = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (hm.containsKey(complement)) {
                return new int[] { hm.get(complement), i };
            }
            
            hm.put(nums[i], i);
        }
        
        return new int[] {};

        }
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;
            System.out.println(Arrays.toString(twoSum(nums,target)));
        } 
    }
