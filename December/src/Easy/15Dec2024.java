package Easy;

class PeekElement {

    /*
    * Problem Of The Day
    * Link : https://www.geeksforgeeks.org/problems/peak-element/1
    * Topic tags : Searching and Algorithm
    * Date : 15 December 2024
    * Level : Basic
    * Example :
    *   Input: arr = [1, 2, 4, 5, 7, 8, 3]
        Output: true
        Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
    * */

    public static int peakElement(int[] arr) {
        return linearSearch(arr);
    }

    private static int linearSearch(int[] arr) {
         int n = arr.length;
         for(int i = 0; i < n; i++){
              if((i == 0 || arr[i] > arr[i - 1]) && (i == n -1 || arr[i] > arr[i + 1])){
                  return i;
              }
         }
         return -1;
    }

    private static int binary(int[]arr){
        int low = 0;
        int high = arr.length;
         while(low <= high){
              int mid = low + (high - low) / 2;
              if((mid == 0 || arr[mid] > arr[mid -1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])){
                  return mid;
              }else if(arr[mid] < arr[mid + 1] && mid < arr.length - 1){
                  low = mid + 1;
              }else{
                  high = mid - 1;
              }

         }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 8, 3};
        int ans = binary(a);
        System.out.println(ans);
    }
}