package ca.ematos.leetcode.pointers;

public class RotateArray {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        //rotate(nums, 3);

        //rotate(nums, 13);

        int[] _nums = {1,2};
        rotate(_nums, 3);

    }

    public static void rotate(int[] nums, int k) {

        if ( k > nums.length){
            k = k % nums.length;
        }

        int[] rotated = new int[nums.length];
        System.arraycopy(nums, nums.length-k, rotated, 0, k);
        System.arraycopy(nums, 0, rotated, k, nums.length-k);
        System.arraycopy(rotated, 0, nums, 0, nums.length);

        System.out.println(nums);
    }
}
