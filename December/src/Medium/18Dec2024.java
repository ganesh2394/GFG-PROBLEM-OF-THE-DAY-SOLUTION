package Medium;

class AllocateMinimumPages {
    /*
   * Problem Of The Day : Allocate Minimum Pages
   * Link : https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
   * Topic tags : Searching, Divide and Conquer and Data structure
   * Date : 18 December 2024
   * Level : Medium
   * Input: arr[] = [12, 34, 67, 90], k = 2
        Output: 113
        Explanation: Allocation can be done in following ways:
        [12] and [34, 67, 90] Maximum Pages = 191
        [12, 34] and [67, 90] Maximum Pages = 157
        [12, 34, 67] and [90] Maximum Pages = 113.
        Therefore, the minimum of these cases is 113, which is selected as the output.* */

    public static int findPages(int[] arr, int k) {
        return findPages(arr, arr.length, k);
    }

    private static int findPages(int[] arr, int n, int k) {

        // Edge case: If students are more than books
        if (k > n) {
            return -1;
        }

        int low = Integer.MIN_VALUE, high = 0;

        // Initialize the search range
        for (int pages : arr) {
            low = Math.max(low, pages); // Maximum of one book
            high += pages;             // Sum of all pages
        }

        int result = -1;

        // Binary Search on the Answer
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, mid)) {
                result = mid;           // Store the valid result
                high = mid - 1;         // Try to find a smaller max
                ;
            } else {
                low = mid + 1;       // Increase the max
            }
        }

        return result;

    }

    private static boolean isPossible(int[] arr, int k, int maxPages) {
        int count_student = 1;  // Start with 1 student
        int current_pages = 0;

        for (int pages : arr) {
            if (current_pages + pages > maxPages) {
                // Allocate to the next student
                count_student++;
                current_pages = pages;

                // If the number of students exceeds k, return false
                if (count_student > k) {
                    return false;
                }
            } else {
                current_pages += pages;
            }
        }

        return true;  // Allocation possible within maxPages
    }


}