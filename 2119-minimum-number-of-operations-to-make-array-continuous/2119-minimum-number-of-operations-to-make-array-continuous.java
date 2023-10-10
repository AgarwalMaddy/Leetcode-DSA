class Solution {
    public int minOperations(int[] nums) {
        int  n = nums.length;
        int windowSize = n;
        int indexCount = 1;
        Arrays.sort(nums);
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]){
                nums[indexCount] = nums[i];
                indexCount++;
            }
        }

        int j = 0;
        for(int i = 0 ; i < indexCount ; i++){
            while(j < indexCount && nums[j] < nums[i] + n){
                j++;
            }
            windowSize = Math.min(n - j + i, windowSize);
        }

        return windowSize;
    }
}