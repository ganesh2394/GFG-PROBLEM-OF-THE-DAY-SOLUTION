import java.util.Arrays;

class RotateArray {

    /* Problem : Rotate Array
        Link : https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
    *   Company Tags : Amazon Microsoft and MAQ Software
    * */
    static void rotateArr(int arr[], int d) {
         reverse(arr,0,d-1);
         reverse(arr,d,arr.length-1);
         reverse(arr, 0, arr.length-1);
    }

    static void reverse(int[]arr, int start, int end){
         while(start < end){
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
         }
    }

    public static void main(String[] args) {
         int[]arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotateArr(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}