package ca.ematos.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args){
        //print(true, checkInclusion("ab", "eidbaooo"));
        print(true, checkInclusion("a", "ab"));

    }
    private static void print(boolean expected, boolean result){
        System.out.println(String.format("Expected [%s] Result [%s]", expected, result));
    }

    public static boolean checkInclusion(String s1, String s2) {

        Set<String> result = new HashSet<>();

        result.stream().forEach(System.out::println);

        return result.contains(s1);
    }

    public static void execute(String prefix, String content){






    }
}
