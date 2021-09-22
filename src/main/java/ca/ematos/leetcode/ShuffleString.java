package ca.ematos.leetcode;

public class ShuffleString {

    public static void main(String[] args) {

        String content = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(content, indices));
    }

    public static String restoreString(String s, int[] indices) {

        char[] shuffled = new char[indices.length];

        for (int i = 0; i < indices.length; i++){
            shuffled[indices[i]] = s.charAt(i);
        }

        return String.valueOf(shuffled);
    }
}