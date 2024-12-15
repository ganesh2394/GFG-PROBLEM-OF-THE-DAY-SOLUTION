package Easy;


class SortedAndRotedMinimum {

    /*
     * Problem Of The Day : Sorted And Rotated Minimum
     *
     * Description : A sorted array of distinct elements arr[] is rotated at some unknown point,
     * the task is to find the minimum element in it.
     *
     * Link : https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1
     * Topic tags : Searching and Algorithm
     * Date : 13 December 2024
     * Level : Easy
     * Input: arr[] = [5, 6, 1, 2, 3, 4]
        Output: 1
        Explanation: 1 is the minimum element in the array.
        *
     * */

    // ---<initial functions>---

    public static int findMin(int[] arr) {
        return binaryMin(arr, 0, arr.length - 1);
    }

    public static int findMax(int[] arr) {
        return binaryMax(arr, 0, arr.length - 1);
    }

    public static int searchTarget(int[] arr, int key) {
        return binaryTarget(arr, 0, arr.length - 1, key);
    }


    // ---<working functions>---

    // find max using binary search
    private static int binaryMax(int[] arr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[high];
    }

    // find min using binary search
    private static int binaryMin(int[] arr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return arr[low];
    }

    // find the target if the given array is sorted and rotated
    private static int binaryTarget(int[] arr, int start, int end, int target) {
        // find the rotation point
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        // rotation point is smallest element index
        int rotationPoint = start;
        start = 0;
        end = arr.length - 1;

        // define the halves where we have to search the target element.
        if (target >= arr[rotationPoint] && target <= arr[end]) {
            // find in left sub array.
            start = rotationPoint;
        } else {
            end = rotationPoint - 1;
        }

        // perform regular binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // otherwise
        return -1;
    }



    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 1, 2, 3, 4};
//        int min = findMin(a);
//        int max = findMax(a);
//        System.out.println(min);
//        System.out.println(max);

//        int result = searchTarget(a, 14);
//        System.out.println(result);

    }

}