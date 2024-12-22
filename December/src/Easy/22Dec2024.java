package Easy;

class SearchingInRowColumn {
    /*
  * Problem Of The Day : Search in a Row-Column sorted matrix
  * Link : https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1
  * Topic tags : Matrix and Data Structure
  * Date : 22 December 2024
  * Level : Easy
  *    Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
       Output: false
       Explanation: 62 is not present in the matrix, so output is false.

  *  * */

    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length - 1;
        int m = mat[0].length - 1;

        int row = 0, col = m;

        while(row <=n && col >= 0){
            if(mat[row][col] == x){
                return true;
            }else if(mat[row][col] < x){
                row++;      //move down
            }else{
                col--;       // move left
            }
        }
        return false;
    }
}