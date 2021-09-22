package ca.ematos.hackerrank.strings;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public class MakeAnagram {


    public static void main(String[] arguments){
        System.out.println(movements("abc", "amnop"));
    }

    private static int movements(String first, String second){

        if(first == null || second == null) {
            return 0;
        }

        boolean isFirstGreater = first.length() > second.length();



        return 0;
    }

    private static int move(char[] lower, char[] greater){

        int moves = greater.length - lower.length;

        int i = 0;
        while (i < lower.length){

            if (lower[i] != greater[i]){
                moves+=2;
            }
            i++;
        }

        return moves;
    }



}
