package ca.ematos.hackerrank.algorithms;

import java.util.Locale;

public class Pangram {

    public static void main(String[] arguments){
        String content = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(content));
    }

    static String pangrams(String s) {
        final String pangram = "pangram";
        final String notPangram = "not pangram";

        if (s == null || s.isEmpty()){
            return notPangram;
        }

        s = s.trim().toLowerCase();

        if (s.length() < 26){
            return notPangram;
        }

        int[] letters = new int[26];

        int x;
        for(int i = 0; i < s.length(); i++){
            x = s.charAt(i);

            if (x == 32){
                continue;
            }

            letters[x - 97]++;
        }

        for(int c : letters){

            if (c == 0){
                return notPangram;
            }
        }

        return pangram;
    }
}
