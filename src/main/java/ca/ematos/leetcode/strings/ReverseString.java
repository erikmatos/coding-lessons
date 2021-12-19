package ca.ematos.leetcode.strings;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args){

        char[] characters = {'h','e','l','l','o'};
        reverseString(characters);
    }

    public static void reverseString(char[] s) {

        int x = 0;
        int y = s.length-1;

        char character;
        while (x < y){


            character = s[x];
            s[x] = s[y];
            s[y] = character;

            x++;
            y--;
        }

        System.out.println(s);
    }
}
