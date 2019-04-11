package com;
import java.util.Arrays;

public class ContainsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1){
            if(nums[i] == nums[i+1]){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,0};
        System.out.println(containsDuplicate(nums));
    }
}
