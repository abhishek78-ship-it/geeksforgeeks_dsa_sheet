 class Solution {
     void pushZerosToEnd(int[] arr) {
         // code here
         int j=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]!=0){
             int temp=arr[i];
               arr[i]=arr[j];
             arr[j]=temp;
             j++;
         }
        } 
    }
 }
// practice two pointer approach 
//  class Solution {

//     void pushZerosToEnd(int[] arr) {

//         // code here

//         int left = 0;
//         int right= arr.length-1;
//         while (left<right)
//         {
//             if(arr[left] !=0)
//             {
                
//                 left++;
//             }
            
//             else if(arr[right] == 0)
            
//             {
                
//                 right--;
//             }

//             else if ( arr[left] == 0 && arr[right] != 0)

//             {

//                 int temp=arr[right];

//                 arr[right]= arr[left];

//                 arr[left]=temp;

//                 left++;

//                 right--;

//             }

//         }

//     }

// }
