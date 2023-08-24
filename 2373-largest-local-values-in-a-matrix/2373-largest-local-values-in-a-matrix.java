class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];
        for(int i = 0 ; i < n - 2 ; i++){
            for(int j = 0 ; j < n-2; j++){
                int max = maxElement(grid , i , j);
                result[i][j] = max;
            }
        }
        return result;
    }
    public int maxElement(int[][] matrix , int a , int b){
        int max = Integer.MIN_VALUE;
        for(int i = a; i < a+3 ; i++){
            for(int j = b ; j < b+3; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}