package ca.ematos.leetcode.pointers;

public class MoveZeros {

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {

        int index = 0;

        while (index < nums.length) {
            if(nums[index] == 0) {
                changeNextAvailable(nums, index);
            }

            index++;
        }
    }

    private static void changeNextAvailable(int[] nums, int zeroIndex){
        for(int i = zeroIndex+1; i < nums.length; i++){
            if (nums[i] != 0){
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                break;
            }
        }
    }
}
