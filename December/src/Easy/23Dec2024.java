package Easy;

class SearchInRowWiseSortedMatrix {
    /*
  * Problem Of The Day : Search in a row-wise sorted matrix
  * Link : https://www.geeksforgeeks.org/problems/search-in-a-row-wise-sorted-matrix/1
  * Topic tags : Matrix and Data Structure
  * Date : 23 December 2024
  * Level : Easy
  *     Input: mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9
        Output: true
        Explanation: 9 is present in the matrix, so the output is true.
        *
        * Idea:
            For each row in the matrix, apply binary search.
            If the element is found in any row, return true.
  *  * */
    public boolean searchRowMatrix(int[][] mat, int x) {

         for(int[]row : mat){
              if(binary(row, x)){
                  return true;
              }
         }

         return false;
    }

    private boolean binary(int[]arr, int target){
           int left = 0, right = arr.length - 1;

           while(left <= right){
               int mid = left + (right - left) / 2;
               if(arr[mid] == target){
                   return true;
               }else if(arr[mid] < target){
                    left = mid + 1;
               }else{
                   right = mid - 1;
               }
           }

           return false;
    }

}
