package ca.ematos.leetcode;

import java.util.Arrays;

public class ShuffletheArray {

    public static void main(String[] args){
        int[] numbers = { 2,5,1,3,4,7 };

        numbers = shuffle(numbers, 3);
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] shuffled = new int[nums.length];

        int pos = 0;
        while ( pos < n){

            int index = pos * 2;

            shuffled[index] = nums[pos];
            shuffled[index+1] = nums[pos+n];

            pos++;
        }

        return shuffled;
    }

    public static int[] shuffle2(int[] nums, int n) {

        int[] shuffled = new int[2*n];

        for(int i = 0; i < n; i++){
            shuffled[2 * i] = nums[i];
            shuffled[2 * i + 1] = nums[n+i];
        }

        return shuffled;
    }


}
