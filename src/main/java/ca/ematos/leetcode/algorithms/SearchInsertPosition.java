package ca.ematos.leetcode.algorithms;

public class SearchInsertPosition {

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        searchInsert(nums, 5);
        searchInsert(nums, 2);
        searchInsert(nums, 7);


    }

    public static int searchInsert(int[] nums, int target) {

        int result = search(nums, 0, nums.length-1, target);

        System.out.println(String.format("Target [%s] Result [%s]", target, result));

        int begin = 0;
        int end = nums.length-1;
        int mid = 0;


        while (end >= begin){
            mid = (begin + end) / 2;

            if (nums[mid] > target){
                end = mid - 1;
            } else if ( nums[mid] < target){
                begin = mid + 1;
            } else {
                System.out.println("Position " + mid);
                return mid;
            }

        }

        System.out.println("Position " + (begin));


        return result;
    }

    private static int search(int[] nums, int begin, int end, int target){

        int mid = (begin + end) / 2;

        if (nums[mid] == target)
            return mid;

        if (nums[mid] > target)
            return begin < mid ? search(nums, begin, mid-1, target) : begin;

        return end > mid ? search(nums, mid+1, end, target) : end +1;
    }
}
