class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex+1;
        int[] result = new int[n];
        result[n-1] = 1;
        int i = n - 2;
        while(i >= 0){
            for(int j = i; j < n-1; j++){
                result[j] += result[j+1];
            }
            i--;
        }
        List<Integer> output = new ArrayList<>();
        for(int k= 0 ; k < n ; k++){
            output.add(result[k]);
        }
        return output;

    }
}