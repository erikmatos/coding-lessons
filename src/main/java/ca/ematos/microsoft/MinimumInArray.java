package ca.ematos.microsoft;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinimumInArray {

    public static void main(String[] args){

        int[] nums = {-2, 10, 90, -900, 300};

        OptionalInt result = Arrays.stream(nums).min();

        System.out.println(result.isPresent() ? result.getAsInt() : 0);
    }
}
