package Medium;

import java.util.ArrayList;

class SearchPattern {

    /*
     * Problem Of The Day : GFG
     * Link : https://www.geeksforgeeks.org/problems/search-pattern0205/1
     * Topic tags : String, Searching Pattern, Data Structure and Algorithm
     * Date : 02 December 2024
     * Level : Medium
     *
     * ------(Sample test case)----------
     *  Input: txt = "abcab", pat = "ab"
        Output: [0, 3]
        Explanation: The string "ab" occurs twice in txt, one starts at
        index 0 and the other at index 3.
     * */

    // Naive Searching Algorithm.
    ArrayList<Integer> search1(String pat, String txt) {

        ArrayList<Integer> result = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
             for( j = 0; j < m; j++){
                  if(pat.charAt(j) != txt.charAt(i + j)){
                      break;
                  }
             }
             if(j==m){
                 result.add(i);
             }
        }
        return result;
    }

    ArrayList<Integer> search(String pat, String txt) {
        
        return new ArrayList<>();
    }
}