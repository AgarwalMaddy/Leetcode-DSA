class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> pairCount = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < n ; i++){
            if(Arrays.binarySearch(nums , i + 1 , n , nums[i] + k) > 0){
                pairCount.add(nums[i]);
            }
        }

        return pairCount.size();
    }
}