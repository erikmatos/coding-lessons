package ca.ematos.hackerrank.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class FormingMagicSquare {

    public static void main(String[] a){

        int[][] matrix =
                {
                    {4, 8, 2},
                    {4, 5, 7},
                    {6, 1, 6}
                };

        List<List<Integer>> list = Arrays.stream(matrix).map(internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList())).collect(Collectors.toList());

        System.out.println(formingMagicSquare(list));
    }


    public static int formingMagicSquare(List<List<Integer>> s) {

        int min = 0;

        Map<Integer, Integer> counter = new HashMap<>();

        int[][] intArray = s.stream().map(u -> u.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);

        int firstLine = intArray[0][0] + intArray[0][1] + intArray[0][2];
        int secondLine = intArray[1][0] + intArray[1][1] + intArray[1][2];
        int thirdLine = intArray[2][0] + intArray[2][1] + intArray[2][2];

        int firstColumn = intArray[0][0] + intArray[1][0] + intArray[2][0];
        int secondColumn = intArray[0][1] + intArray[1][1] + intArray[2][1];
        int thirdColumn = intArray[0][2] + intArray[1][2] + intArray[2][2];

        int firstDiagonal = intArray[0][0] + intArray[1][1] + intArray[2][2];
        int secondDiagonal = intArray[0][2] + intArray[1][1] + intArray[2][0];

        merge(counter, firstLine);
        merge(counter, secondLine);
        merge(counter, thirdLine);
        merge(counter, firstColumn);
        merge(counter, secondColumn);
        merge(counter, thirdColumn);
        merge(counter, firstDiagonal);
        merge(counter, secondDiagonal);

        System.out.println(counter);

        return min;
    }

    private static void merge(Map<Integer, Integer> counter, int sum){
        if (!counter.containsKey(sum)){
            counter.put(sum, 1);
        } else {
            counter.put(sum, counter.get(sum) + 1);
        }
    }
}
