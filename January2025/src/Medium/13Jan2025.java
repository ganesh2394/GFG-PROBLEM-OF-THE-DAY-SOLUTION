package Medium;

class ContainerWithMostWater {
     /*
 Problem of the Day : Container With Most Water
 Link : https://www.geeksforgeeks.org/problems/container-with-most-water0535/1
 Topic tags : Array, Mathematical, puzzles, Data Structure and Algorithms
 Company Tags : Google, Microsoft and Amazon
    Examples:
    Input: arr[] = [1, 5, 4, 3]
    Output: 6
    Explanation: 5 and 3 are 2 distance apart. So the size of the base is 2. Height of container = min(5, 3) = 3.
    So, total area to hold water = 3 * 2 = 6.

    Time Complexity
    O(n): We traverse the array once using two pointers.
    Space Complexity: O(1) as no extra space is used.

    Algorithm Steps
    * Initialize left to 0 and right to n-1.
    * Initialize max_area to 0.
    * While left < right:
            1. Calculate the area: area = (right - left) * min(arr[left], arr[right]).
            2. Update max_area = max(max_area, area).
            3. Move the shorter line inward:
                a) If arr[left] < arr[right], increment left.
                b) Else, decrement right.
    * Return max_area.

 * */

    public int maxWater(int arr[]) {

         int max_area = 0;
         int left = 0, right = arr.length - 1;

         while(left < right){
             // Calculate area
             int width = right - left;
             int height = Math.min(arr[left], arr[right]);

             // Update max area
             max_area = Math.max(max_area, (width * height));

             // Move the shorter pointer
             if(arr[left] < arr[right]){
                 left++;
             }else{
                 right--;
             }
         }

         return max_area;
    }
}