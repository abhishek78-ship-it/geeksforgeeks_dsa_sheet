class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
     ArrayList<Integer> ans = new ArrayList<>();
       int n=arr.length;
//       for(int i=0;i<n;i++){
//          boolean leader= true;
         
//          for(int j=i+1;j<n;j++){
            
//             if (arr[i]<arr[j])
//           {
//              leader= false;
//             break;
//           }
//         }
//         if (leader){
//             ans.add(arr[i]);
//         }
//     } 
//     return ans;
//     }
// } time limit exceed -o(n²)
import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
//      ArrayList<Integer> ans = new ArrayList<>();
//       int n=arr.length;
//       int maxR = arr[n-1];
//       ans.add(maxR);
//       for ( int i=n-2;i>=0;i--){
//       if (arr[i]>arr[maxR])
//       ans.add(arr[i]);
//       maxR=arr[i];
      
//   }
  
//   Collections.reverse(ans);
//   return ans ;
//     }
// }
// error =ArrayIndexOutOfBoundsException
    ArrayList<Integer> ans = new ArrayList<>();
       int n=arr.length;
       if (n==0){
           return ans;
       }
      int maxR = arr[n-1];
       ans.add(maxR);
       for ( int i=n-2;i>=0;i--){
      if (arr[i]>arr[maxR])
       ans.add(arr[i]);
       maxR=arr[i];
      
   }
  
   Collections.reverse(ans);
   return ans ;
     }
 }
