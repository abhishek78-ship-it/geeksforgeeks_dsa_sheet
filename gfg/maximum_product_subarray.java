class Solution {
    int maxProduct(int[] arr) {

        int maxp = Integer.MIN_VALUE;
        int  srt = 1,
        int  end = 1;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(srt == 0) srt = 1;
            if(end == 0) end = 1;
            srt = srt * arr[i];
            end = end * arr[n-1-i];
            maxp = Math.max(maxp, Math.max(srt,end));  
        }
        return maxp;
    }
}

