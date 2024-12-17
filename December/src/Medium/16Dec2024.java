package Medium;

class KthElementOfTwoArrays {

    /*
    * Problem Of The Day : K-th Element of Two Arrays
    * Link : https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
    * Topic tags : Searching and Algorithm
    * Date : 16 December 2024
    * Level : Medium
    * Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
        Output: 6
        Explanation: The final combined sorted array would be
        * [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
    * */

    public long kthElement(int k, int arr1[], int arr2[]) {

        int n = arr1.length;
        int m = arr2.length;

        if(n > m) return kthElement(k, arr2, arr1);

        int low = Math.max(0, k - m);
        int high = Math.min(k, n);

        while(low <= high){
            int x = (low + high) / 2;
            int y = k - x;

            int a1 = (x == 0) ? Integer.MIN_VALUE : arr1[x - 1];
            int a2 = (y == 0) ? Integer.MIN_VALUE : arr2[y - 1];
            int b1 = (x == n) ? Integer.MAX_VALUE : arr1[x];
            int b2 = (y == m) ? Integer.MAX_VALUE : arr2[y];

            if(a1 <= b2 && a2 <= b1){
                return Math.max(a1, a2);
            }
            else if(a1 > a2){
                high = x - 1;
            }
            else{
                low = x + 1;
            }
        }

        return -1;
    }
}