class Solution {
    public void rotateArr(int[] arr, int d) {
         // code here
         int n = arr.length;
         for (int k = 0; k < d; k++) {
      int temp = arr[0];
      for (int i = 1; i < n; i++) {
           arr[i - 1] = arr[i];
             }
             arr[n - 1] = temp;
    }
    }
}// time limit exceed
