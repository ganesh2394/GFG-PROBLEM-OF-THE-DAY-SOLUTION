package Easy;

class EquilibriumPoint {

    /*
Problem of the Day : Equilibrium Point
Link : https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
Topic tags : Data Structure and algorithms, Array, Prefix etc.
Company Tags : Amazon and Adobe
  Examples:
    Input: arr[] = [1, 2, 0, 3]
    Output: 2
    Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 0 + 3 = 3.
* */
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {

         int total_sum = 0;

         for(int num : arr){
              total_sum += num;
         }

         int leftSum = 0;
         for(int i = 0; i < arr.length; i++){
              int rightSum = total_sum - leftSum - arr[i];
              if (rightSum == leftSum){
                  return i;
              }

              leftSum += arr[i];
         }

         return -1;
    }
}