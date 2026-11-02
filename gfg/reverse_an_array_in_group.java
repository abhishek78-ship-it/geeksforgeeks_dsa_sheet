class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        for(int i=0;i<n;i+=k){
            int l=i;
            int r = Math.min(i+k-1,n-1);//This line calculates the ending index (r) 
            //of a window or subarray without going outside the array.

            while(l<r){
                int t = arr[l];
                arr[l++] = arr[r];
                arr[r--] = t;

            }
        }
    }
}
