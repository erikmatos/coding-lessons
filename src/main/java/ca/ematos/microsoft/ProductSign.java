package ca.ematos.microsoft;

import java.util.Arrays;

public class ProductSign {

    public static void main(String[] args){

        int x = 3;

        int[] intArray = {-2, 2, 6, 10, -10};

        System.out.println(solution(intArray));
    }

    private static int solution(int[] intArray){

        if ( intArray == null ){
            return 0;
        }

        int result = Arrays.stream(intArray).reduce(1, Math::multiplyExact);

        return Integer.compare(result, 0);
    }
}
