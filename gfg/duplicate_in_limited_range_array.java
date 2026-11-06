class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            
            if(arr[i] == arr[i+1]){
                result.add(arr[i]);
               
            }
        }
        return result;
    }
}

