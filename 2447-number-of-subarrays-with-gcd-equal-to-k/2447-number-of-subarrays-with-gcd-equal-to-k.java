class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ans = 0;        
        for(int i=0;i<nums.length;i++) {
            int g = nums[i];                        
            for(int j=i;j<nums.length && g >= k;j++) 
                if((g = GCD(g, nums[j])) == k)
                    ans++;                                  
        }
        return ans;
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