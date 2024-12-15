package Easy;

class NumberOfOccurrence {
    /*
     * Problem Of The Day : GFG
     * Link : https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
     * Topic tags : Data Structure and Algorithm , Binary Search
     * Date : 12 December 2024
     * Level : Easy
     * Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
        Output: 4
        *
     * */
    
    static int countFreq(int[] arr, int target) {
        return binary(arr, 0, arr.length - 1, target);
    }

    private static int binary(int[] arr, int start, int end, int target) {
        if (start > end) {
            return 0;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return 1 + binary(arr, start, mid - 1, target) + binary(arr, mid + 1, end, target);
        }
        else if(arr[mid] < target){
             return binary(arr, mid + 1, end, target);
        }else{
            return binary(arr, start, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 12, 12, 12};
        int target = 12;
        int result = countFreq(arr, target);
        System.out.println(result);

    }
}