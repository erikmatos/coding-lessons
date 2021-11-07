package ca.ematos.leetcode.arrays;

import java.util.Arrays;

public class KthSmallest {

    public static void main(String[] args){
        int[][] matrix = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };

        System.out.println(kthSmallest(matrix, 8));

        int[][] _matrix  =  {
                        {16, 28, 60, 64},
                        {22, 41, 63, 91},
                        {27, 50, 87, 93},
                        {36, 78, 87, 94 }
                    };
        System.out.println(kthSmallest(_matrix, 3));

    }

    public static int kthSmallest(int[][] matrix, int k) {
        return Arrays
                .stream(matrix)
                .flatMapToInt(x -> Arrays.stream(x))
                .sorted()
                .skip(k-1)
                .findFirst()
                .getAsInt();
    }
}
