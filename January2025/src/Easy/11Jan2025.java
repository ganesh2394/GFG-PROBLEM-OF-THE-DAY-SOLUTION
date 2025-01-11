package Easy;

import java.util.HashSet;

class LongestSubWithDistinctCharacters {
    /*
 Problem of the Day : Longest substring with distinct characters
 Link : https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1
 Topic tags : String and Data Structure, Set
 Company Tags : Microsoft, Amazon and Adobe
    Examples:
    Input: s = "geeksforgeeks"
    Output: 7
    Explanation: "eksforg" is the longest substring with all distinct characters.
 * */
    public int longestUniqueSubstr(String s) {

        int max_length = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {

             while(set.contains(s.charAt(end))){
                   set.remove(s.charAt(start));
                   start++;
             }

             // add the character
            set.add(s.charAt(end));

             // update the max_length;
            max_length = Math.max(max_length, end - start + 1);
        }

        return max_length;
    }
}