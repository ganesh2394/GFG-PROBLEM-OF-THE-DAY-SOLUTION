package Easy;
import java.util.HashMap;

 class CountPairWithGivenSum {
    /*
      * Problem Of The Day : Search in a row-wise sorted matrix
      * Link : https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1
      * Topic tags : Array, Data Structure and Hash
      * Date : 27 December 2024
      * Level : Easy
      *     Input: arr[] = [1, 5, 7, -1, 5], target = 6
            Output: 3
            Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5).
      *  * */

    // way-01
    private static int countPairs(int arr[], int target) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                result += map.get(complement);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return result;
    }


}
