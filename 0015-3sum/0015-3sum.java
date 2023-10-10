class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> removeDupli = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int currSum = nums[i] + nums[j] + nums[k];
                if(currSum == 0){
                    removeDupli.add(Arrays.asList(nums[i] , nums[j], nums[k]));
                    j++;
                    k--;
                }else if(currSum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        resultList.addAll(removeDupli);
        return resultList;
    }
}