package Medium;

class SearchInSortedMatrix {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {

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