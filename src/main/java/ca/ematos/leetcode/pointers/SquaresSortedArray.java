package ca.ematos.leetcode.pointers;

import java.util.Arrays;

public class SquaresSortedArray {

    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        Arrays.stream(sortedSquares(nums)).forEach(c->System.out.println(c));
    }

    public static int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}
