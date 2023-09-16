class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        result[prices.length-1] = prices[prices.length-1];
        for(int i = 0 ; i < prices.length - 1 ; i++){
            for(int j = i + 1 ; j < prices.length ; j++){
                if(prices[j] <= prices[i]){
                    result[i] = prices[i] - prices[j];
                    break;
                }else{
                    result[i] = prices[i];
                }
            }
        }
        
        return result;
    }
}