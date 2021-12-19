package ca.ematos.leetcode.pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTwo {

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        Arrays.stream(twoSum(nums, 9)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> contents = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int finder =  target - numbers[i];
            if (contents.containsKey(finder)){
                return new int[]{contents.get(finder), i + 1};
            } else {
                contents.put(numbers[i], i + 1);
            }
        }

        return new int[]{-1,-1};
    }
}
