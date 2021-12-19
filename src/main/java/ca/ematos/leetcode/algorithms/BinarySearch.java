package ca.ematos.leetcode.algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};

       // search(nums, 9);
        //search(nums, 2);
        search(nums, 12);
        //search(nums, -1);
    }

    private static int search(int[] nums, int target){

        int result = search(nums, 0, nums.length -1, target);

        if (result == -1)
            System.out.println(String.format("Element [%s] not present", target));
        else
            System.out.println(String.format("Element [%s] found at index [%s]", target, result));

        return result;
    }

    private static int search(int[] nums, int begin, int end, int target){

        if (end >= begin){

            int mid = begin + (end - begin) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] > target)
                return search(nums, begin, mid-1, target);

            return search(nums, mid+1, end, target);
        }

        return -1;
    }

}
