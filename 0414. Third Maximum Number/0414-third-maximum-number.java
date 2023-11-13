class Solution {
    public static int thirdMax(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int ans = nums[nums.length-1];
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < ans){
                count++;
                ans = nums[i];
            }
            if(count == 2){
                return ans;
            }
        }

        return nums[nums.length - 1];
    }
}