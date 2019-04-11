package com;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int value = 0;
        for (int i = 0;i < nums.length - 1;i++){
            for (int j = i + 1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    value = nums[i];
                    break;
                }
            }
        }
        return value;
    }


    public static void main(String args[]){
        int nums[] = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
