package ca.ematos.leetcode.strings;

public class ReversePhrase {

    public static void main(String[] args){
        String content = "Let's take LeetCode contest";
        System.out.println(reverseWords(content));
    }

    public static String reverseWords(String s) {

        char[] characters = s.toCharArray();

        int first = 0;
        for(int i = 0; i < characters.length; i++){
            if(characters[i] == 32){
                reverse(characters, first, i-1);
                first = i+1;
                continue;
            }

        }
        reverse(characters, first, characters.length-1);

        return new String(characters);
    }

    public static void reverse(char[] characters, int begin, int end){
        char character;
        while (begin < end){
            character = characters[begin];
            characters[begin] = characters[end];
            characters[end] = character;

            begin++;
            end--;
        }
    }

}
