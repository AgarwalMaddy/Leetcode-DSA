class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int count = 1;
        int result = -1;
        double occurence = 0.25 * n;
    
        if(n == 1){
            return arr[0];
        }
        for(int i = 1 ; i < n; i++){
            if(arr[i] == arr[i-1]){
                count++;
                
                if(count > occurence){
                    result = arr[i];
                    break;
                }
            }else{
                count = 1;
            }
        }
        
        return result;
    }
}