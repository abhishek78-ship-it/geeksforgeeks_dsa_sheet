class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        int next = 0;
        int res = 0;
        for(int i=n-1; i>=0; i--) {
            int curr = (arr[i]*(n-i)) + next;
            res += curr;
            next = curr;
        }
        return res;
    }
}
