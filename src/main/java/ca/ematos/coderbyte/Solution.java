package ca.ematos.coderbyte;

import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args){
        FirstFactorial(8);
    }

    public static int FirstFactorial(int num) {

        num = IntStream.rangeClosed(2, num).reduce(1, (x, y) -> x * y);

        System.out.println(num);

        return num;
    }

}
