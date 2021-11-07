package ca.ematos.leetcode;

import java.util.*;

public class TwoSum {
    public static void main(String[] args){

        solution(new int[]{2,7,11,15,3,6,8,9}, 12);
        /*
        int[] results = _twoSum(new int[]{ 2,7,11,15}, 26);
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
        */
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

    public static int[] _twoSum(int[] nums, int target) {

        Map<Integer, Integer> content = new HashMap();

        for(int i=0; i < nums.length;  i++){
            int diff = target - nums[i];
            if(content.containsKey(diff)){
                return new int[]{content.get(diff), i};
            } else {
                content.put(nums[i], i);
            }
        }

        return new int[]{-1,-1};
    }

    public static void solution(int[] nums, int target){
        Set<Integer> content = new HashSet<>();

        for(int num : nums){

            int diff = target - num;
            if (content.contains(diff)){
                int item = content.stream().filter(c->c.equals(diff)).findFirst().get();
                System.out.println(String.format("[%s][%s]", item, num));
                break;
            } else {
                if (content.isEmpty() && diff == 0){
                    System.out.println(String.format("[%s][%s]", num, 0));
                    break;
                } else {
                    content.add(num);
                }
            }
        }
    }
}
