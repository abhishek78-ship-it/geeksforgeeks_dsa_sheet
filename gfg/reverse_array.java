class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int l=0;
        int r=arr.length-1;
              while(l<r){
               int temp =arr[r];
               arr[r] = arr[l];
              arr[l] = temp;
                 l++;
                 r--;
        }
    }
}
