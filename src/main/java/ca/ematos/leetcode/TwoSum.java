package ca.ematos.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){

        int[] results = twoSum(new int[]{ 2,7,11,15}, 9);
        Arrays.stream(results).forEach(System.out::println);

        results = twoSum(new int[]{3,2,4}, 6);
        Arrays.stream(results).forEach(System.out::println);

        results = twoSum(new int[]{3,3}, 6);
        Arrays.stream(results).forEach(System.out::println);

        results = twoSum(new int[]{3,2,3}, 6);
        Arrays.stream(results).forEach(System.out::println);

        results = twoSum(new int[]{-1,-2,-3,-4,-5}, -8);
        Arrays.stream(results).forEach(System.out::println);

        results = twoSum(new int[]{2,5,5,11}, 10);
        Arrays.stream(results).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];

        if (nums.length < 2){
            return positions;
        }

        outer:for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if ( sum == target) {
                    positions[0] = i;
                    positions[1] = j;

                    break outer;
                }
            }
        }

        return positions;
    }
}
