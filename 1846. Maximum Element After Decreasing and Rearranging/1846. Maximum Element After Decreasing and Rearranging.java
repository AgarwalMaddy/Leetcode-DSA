class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int[] count = new int[n];
        for(int i : arr){
            ++count[Math.min(i - 1 , n - 1)];
        }

        int result = 1;
        for(int i = 0 ; i < n ; i++){
            result = Math.min(i + 1 , result + count[i]);
        }

        return result;
    }
}