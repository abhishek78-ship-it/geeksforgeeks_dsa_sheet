class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int i=2;
        while(n>=i){
            if(n%i==0)
            n/=i;
            else
            i++;
        }
        return i;
    }
}
