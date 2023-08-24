class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i+=2){
            int freq = nums[i];
            int value = nums[i+1];
            int[] array = freqValuePair(freq , value);
            for(int j = 0 ; j < array.length ; j++){
                resultList.add(array[j]);
            }
        }
        
        int[] result = new int[resultList.size()];
        for(int i = 0 ; i < resultList.size() ; i++){
            result[i] = resultList.get(i);
        }
        
        return result;
    }
    public int[] freqValuePair(int freq , int value){
        int[] result = new int[freq];
        for(int i = 0 ; i < freq ; i++){
            result[i] = value;
        }
        return result;
    }
}