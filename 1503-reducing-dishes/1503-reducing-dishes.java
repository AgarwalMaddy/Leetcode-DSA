class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int startMultiplier = 1;
        int startIndex = 0 , sum = 0 , max = Integer.MIN_VALUE;
        while(startIndex < n) {
            sum = arraySum(satisfaction, n, startIndex++, startMultiplier);
            if (sum > max) {
                max = sum;
            }
        }
        if(max < 0){
            max = 0;
        }
        return max;
    }
    public int arraySum(int[] arr , int n , int startIndex , int startMultiplier){
        int sum = 0;
        for(int i = startIndex ; i < n ; i++){
            sum += arr[i] * startMultiplier;
            startMultiplier++;
        }
        return sum;
    }
}