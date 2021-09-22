package ca.ematos.codesignal;

import java.util.Arrays;
import java.util.concurrent.Callable;

public final class AEquilibrium  {

    public static void main(String[] args){
        //System.out.println(changeToAnadrome("apple"));
        //System.out.println(changeToAnadrome("abcb"));
        //System.out.println(changeToAnadrome("abcdefgh"));
        System.out.println(changeToAnadrome("abba"));


    }

    static int changeToAnadrome(String word) {
        char[] characters= word.toCharArray();
        Arrays.sort(characters);

        int countAppend = 0;
        boolean hasUnique = false;
        int countCharacter = 1;
        char current = characters[0];

        for (int i = 1; i < characters.length; i++){
            if ( current == characters[i]){
                countCharacter++;
            } else {
                //even
                if (countCharacter % 2 != 0){
                    if (!hasUnique){
                        hasUnique = true;
                    } else {
                        countAppend++;
                    }
                }

                current = characters[i];
                countCharacter=1;
            }
        }

        if (countCharacter % 2 != 0){
            if (hasUnique){
                countAppend++;
            }
        }

        return countAppend;
    }

}

