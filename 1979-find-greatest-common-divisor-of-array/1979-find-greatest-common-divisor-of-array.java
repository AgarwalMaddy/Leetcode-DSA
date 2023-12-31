class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return GCD(nums[0] , nums[nums.length - 1]);
        
    }
    public int GCD(int a , int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        
        if(a == b){
            return a;
        }
        if(a > b){
           return GCD(a-b , b);
        }
        
        return GCD(a , b - a);
    }
}