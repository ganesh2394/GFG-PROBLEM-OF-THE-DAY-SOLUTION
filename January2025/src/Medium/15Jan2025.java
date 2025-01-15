package Medium;

import java.util.HashMap;

class LongestSubarrayWithSumK {
    /*
    Problem of the Day : Longest Subarray with Sum K
    Link : https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
    Topic tags : HashMap, Prefix-sum, Array, Data Structure and Algorithms
    Company tags : Amazon

    Examples:-
    Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
    Output: 6
    Explanation: Sub-arrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10].
    The length of the longest subarray with a sum of 15 is 6.
    * */
    public int longestSubarray(int[] arr, int k) {
        int max_length = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for(int i = 0; i < arr.length; i++){
            // update the prefixSum
            prefixSum += arr[i];

            // check if the prefix sum is equal to k
            if(prefixSum == k){
                 max_length = i + 1;
            }

            // check if prefixSum - k exists in the hash map
            if(map.containsKey(prefixSum -k)){
                max_length = Math.max(max_length, i - map.get(prefixSum - k));
            }


            // store the first occurrence of the prefixSum in the hash map
            if(!map.containsKey(prefixSum)){
                 map.put(prefixSum, i);
            }
        }

        return max_length;
    }
}