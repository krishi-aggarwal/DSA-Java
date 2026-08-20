package Leetcode;

import java.util.HashMap;

public class P1512{
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                p+=h.get(nums[i]);
                h.put(nums[i] , h.getOrDefault(nums[i], 0)+1);
            }
            else{
                h.put(nums[i],1);
            }
            
            System.out.println(h);
        }
        return p;

    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println("Output : " + numIdenticalPairs(nums));
    }
}