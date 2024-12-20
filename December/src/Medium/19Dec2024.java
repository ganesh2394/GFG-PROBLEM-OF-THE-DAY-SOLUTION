package Medium;
class KthMissingNumber {

    /*
   * Problem Of The Day : Kth Missing Positive Number in a Sorted Array
   * Link : https://www.geeksforgeeks.org/problems/kth-missing-positive-number-in-a-sorted-array/1
   * Topic tags : Binary Search and Data Structure and Algorithm
   * Date : 19 December 2024
   * Level : Medium
   *    Input: Input: arr[] = [2, 3, 4, 7, 11], k = 5
        Output: 9
        Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9. * */

    public int kthMissing(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);     // Missing numbers up to arr[mid]

            if(missing < k){
                low = mid + 1;      // Continue searching in the right half
            }else{
                high = mid -1 ;     // Continue searching in the left half
            }
        }

        return low + k;
    }
}