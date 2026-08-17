package Leetcode;

import java.util.HashMap;
import java.util.Scanner;

//Contains Duplicate

public class P0217 {

    public static boolean containsDuplicate(int[] nums){
        //creating hashmap
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                return true;
            }
            h.put(nums[i],1);
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int[] nums = new int[in.nextInt()];

        //creating array
        for(int i=0;i<nums.length;i++){
            System.out.print("\nEnter Value " + i + " : ");
            nums[i] = in.nextInt();
        }   

        System.out.println("\nOutput : "+containsDuplicate(nums));
        

    }
}
