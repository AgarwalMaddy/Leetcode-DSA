import java.util.HashMap;

class Solution {
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        int resultCount = 0;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i] - reverseNum(nums[i]);
        }
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i : nums){
            if(frequency.containsKey(i)){
                resultCount = (resultCount + frequency.get(i)) % 1000000007 ;
                frequency.put(i, frequency.get(i) + 1);
            }else{
                frequency.put(i, 1);
            }
        }
        return resultCount;
    }
    
    public int reverseNum(int n){
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n = n / 10;
        }
        return reverse;
    }
}