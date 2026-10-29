class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int i =0;
        while(n>0){
            n=n/5;
            i+=n;
        }
    return i ;
    }
}
