package Medium;

import java.util.Arrays;

class CountNumberOfPossibleTriangle {
    // Function to count the number of possible triangles.

    /*
    Problem of the Day : Count the number of possible triangles
    Link : https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1
    Topic tags : Sorting, Array and Data Structure
    Company tags : Microsoft and Amazon

    Examples:-
    Input: arr[] = [4, 6, 3, 7]
    Output: 3
    Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7].
    Note that [3, 4, 7] is not a possible triangle.
    * */

    static int countTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Sort the array
        Arrays.sort(arr);

        // Iterate over each possible triplet
        for (int i = 0; i < n - 2; i++) {
            // Skip zeros as they cannot form a triangle
            if (arr[i] == 0) continue;
            int k = i + 2; // Third element in the triplet
            for (int j = i + 1; j < n - 1; j++) {
                // Move k to the right to find valid triplets
                while (k < n && arr[i] + arr[j] > arr[k]) {
                    k++;
                }
                // If k is more than j, it means there are (k - j - 1) valid triplets
                count += k - j - 1;
            }
        }

        return count;
    }
}