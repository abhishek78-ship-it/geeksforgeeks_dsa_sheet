// class Solution {
//     public void rotateArr(int[] arr, int d) {
//          // code here
//          int n = arr.length;
//          for (int k = 0; k < d; k++) {
//       int temp = arr[0];
//       for (int i = 1; i < n; i++) {
//            arr[i - 1] = arr[i];
//              }
//              arr[n - 1] = temp;
//     }
//     }
//} time limit exceed
class Solution {
    public void rotateArr(int arr[], int d) {
       int l=arr.length;
       d=d%l;
       reverse(arr,0,d);
       reverse(arr,d,l);
       reverse(arr,0,l);
        }
        private void reverse(int arr[],int left,int right){
            int l=left+right;
            if(l<=1)
            return;
            right=l/2;
            for(int i=left;i<right;i++){
                int temp=arr[i];
                arr[i]=arr[l-i-1];
                arr[l-i-1]=temp;
            }
        }
} 
