package Medium;

import java.util.Arrays;

class AggressiveCows {
    /*
    * Problem Of The Day : Aggressive Cows
    * Link : https://www.geeksforgeeks.org/problems/aggressive-cows/1
    * Topic tags : Binary Search and Data Structure and Algorithm
    * Date : 17 December 2024
    * Level : Medium
    * Input: stalls[] = [1, 2, 4, 8, 9], k = 3
        Output: 3
        Explanation: The first cow can be placed at stalls[0],
        the second cow can be placed at stalls[2] and
        the third cow can be placed at stalls[3].
        The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
    * */

    public static int aggressiveCows(int[] stalls, int k) {
        return aggressiveCows(stalls, stalls.length, k);
    }


    // Function to find the largest minimum distance
    private static int aggressiveCows(int[] stalls, int n, int k) {
        Arrays.sort(stalls);
        int low = 1;         // Minimum possible distance
        int high = stalls[n - 1] - stalls[0];   // Minimum possible distance
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;      // Midpoint of the search space
            if (isFeasible(stalls, k, mid)) {
                result = mid;
                low = mid + 1;             // Try for a larger minimum distance
            } else {
                high = mid - 1;    // Try for a smaller minimum distance
            }
        }
        return result;          // Return the largest minimum distance
    }

    private static boolean isFeasible(int[] stalls, int k, int distance) {
        int cowPlaced = 1;
        int last_position = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last_position >= distance) {
                cowPlaced++; // Place another cow
                last_position = stalls[i]; // Update the position of the last placed cow
            }
            if (cowPlaced >= k) { // If all cows are placed successfully
                return true;
            }
        }

          return false;  // Not possible to place all cows

    }
}