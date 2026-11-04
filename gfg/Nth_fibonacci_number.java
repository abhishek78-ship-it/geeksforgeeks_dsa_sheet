// class Solution {
//     static int nthFibonacci(int n) {
//         if(n<=1)
//         {
//             return n;
//         }
//         return nthFibonacci(n-1)+nthFibonacci(n-2);
//     }
// }

  public int nthFibonacci(int n) {
        // code here
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        
        return a;
    }
}

