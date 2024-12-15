package Medium;

class SearchInSortedRotateArray {
    /*
    * Problem Of The Day
    * Link : https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
    * Topic tags : Searching and Algorithm
    * Date : 14 December 2024
    * Level : Medium
    * Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
        Output: 8
        Explanation: 3 is found at index 8.
        *
        * Approach :
        *   Use binary search to find the rotation point (smallest element).
            This divides the array into two sorted sub-arrays.
            Perform binary search in the appropriate half where the target might exist.
       *
    * */

    static int search(int[] arr, int key) {

        return binary(arr, 0, arr.length - 1, key);
    }

    private static int binary(int[]arr, int low, int high, int target){
          while(low < high){
               int mid = low + (high - low) / 2;
               if(arr[mid] > arr[high]){
                   low = mid + 1;
               }else{
                   high = mid;
               }
          }

          int rotationPoint = low;
          low = 0;
          high = arr.length - 1;

          if(target >= arr[rotationPoint] && target <= arr[high]){
                low = rotationPoint;
          }else{
               high = rotationPoint - 1;
          }

          while(low <= high){
               int mid = low + (high - low) / 2;
               if(arr[mid] == target){
                   return mid;
               }else if(arr[mid] < target){
                    low = mid + 1;
               }else{
                    high = mid - 1;
               }
          }

          return -1;
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(search(a, key));
    }
}