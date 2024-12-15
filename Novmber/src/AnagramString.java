class AnagramString {

    /* Problem Of The Day : Anagram
    *  Link : https://www.geeksforgeeks.org/problems/anagram-1587115620/1
    *  topic tags : Data Structure, String and Array
    *  Date : 30 November 2024
    *  Level : Easy
    * */

    public static boolean areAnagrams(String s1, String s2) {
        // count the frequencies of each character.
        int[]a = new int[26];
        int[]b = new int[26];

        // calculate the length of both strings.
        int n1 = s1.length();
        int n2 = s2.length();

        // if both strings have different length then :
        if(n1 != n2){
            return false;
        }

        // count frequency of character in s1 string.
        for(char ch : s1.toCharArray()){
            a[ch-'a']++;
        }
        // count frequency of character in s2 string.
        for(char ch : s2.toCharArray()){
            b[ch-'a']++;
        }

        // traverse the strings and check both have same frequencies characters or not.
        for(int i = 0; i < n1; i++) {
            if (a[i] != b[i]) {
                return false;           // different character frequency.
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "ganesh";
        String s2 = "sanegh";

        boolean result = areAnagrams(s1, s2);
        System.out.println(result);
    }
}