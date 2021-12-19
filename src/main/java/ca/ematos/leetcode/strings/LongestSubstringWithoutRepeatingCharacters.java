package ca.ematos.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){
        String s = "abcabcbb";
        //System.out.println(lengthOfLongestSubstring(s));

        s = "pwwkew";
        //System.out.println(lengthOfLongestSubstring(s));

        s = " ";
        //System.out.println(lengthOfLongestSubstring(s));

        s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;

        if (s == null){
            return longest;
        }

        Map<Object, Integer> counter = new HashMap<>();

        int i = 0;
        while (i < s.length()){
            if (counter.containsKey(s.charAt(i))){
                longest = Math.max(longest, counter.size());
                i = counter.get(s.charAt(i)) + 1;
                counter = new HashMap<>();
            }

            counter.put(s.charAt(i), i);
            i++;
        }

        longest = Math.max(longest, counter.size());

        return longest;
    }

    public int _lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap();

        int left = 0;
        int right = 0;
        int maxSize = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            right = i;

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, i);
            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }
}
