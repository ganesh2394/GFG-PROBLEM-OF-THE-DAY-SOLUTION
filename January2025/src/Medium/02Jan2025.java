package Medium;

import java.util.HashMap;

class SubArrayWithSumK {
    /*
    Problem of the Day : Sub-arrays with sum K
    Link : https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
    Topic tags : Hash and Data Structure
    Company : Microsoft

    Examples:-
    Input: arr = [10, 2, -2, -20, 10], k = -10
    Output: 3
    Explaination: Sub-arrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
    * */
    public int countSubarrays(int arr[], int k) {

        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0, result = 0;

        for(int num : arr){
            prefixSum += num;

            if(map.containsKey(prefixSum - k)){
                result += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }
}