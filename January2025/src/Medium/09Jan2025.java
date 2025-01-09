package Medium;

import java.util.ArrayList;

class IndexesOfSubarraySum {
    /*
  Problem of the Day : Indexes of Subarray Sum
  Link : https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
  Topic tags : Sorting, two pointer approach and Data Structure

  Examples:-
    Input: arr[] = [1, 2, 3, 7, 5], target = 12
    Output: [2, 4]
    Explanation: The sum of elements from 2nd to 4th position is 12.
  * */
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        int n = arr.length;
        int start = 0;
        int current_sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int end = 0; end < n; end++){

             current_sum += arr[end];

             // shrink sliding window
            while(current_sum > target && start <= end){
                 current_sum -= arr[start];
                 start++;
            }

             if(current_sum == target){
                 result.add(start + 1);
                 result.add(end + 1);
                 return result;
             }
        }
        // otherwise
        result.add(-1);
        return result;
    }
}