package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = new int[]{3, 2, 4};
        twoSum(intArray, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] answers = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    answers[0] = i;
                    answers[1] = j;
                    return answers;
                }
            }
        }
        return nums;
    }
}
