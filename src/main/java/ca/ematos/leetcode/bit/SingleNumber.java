package ca.ematos.leetcode.bit;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int missing = 0;

        for(int num : nums) {
            missing = missing ^ num;
            System.out.println(String.format("Missing [%s]", missing ^ num));

        }

        return missing;
    }
}
