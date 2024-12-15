package Easy;

import java.util.HashMap;

class NoRepeatCharacter {

    /*
    * Problem Of The Day : GFG
    * Link : https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
    * Topic tags : Data Structure, Strings and Hash.
    * Date : 01 December 2024
    * Level : Easy
    * */

    static char nonRepeatingChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // count the frequency of each character
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // traverse and check first character which came only once.
        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1){
                return ch;         // return here
            }
        }
        return '$';         // if not present then return `$`
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char ch = nonRepeatingChar(s);
        if(ch == '$'){
            System.out.println(-1);
        }else{
            System.out.println("First no repeat character is : " + ch);
        }
    }
}