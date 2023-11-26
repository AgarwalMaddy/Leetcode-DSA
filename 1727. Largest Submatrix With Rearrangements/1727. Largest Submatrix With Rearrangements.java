class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 1 ; i < rows ; i++){
            for(int j = 0 ; j < cols; j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }

        int maxArea = 0;

        for(int i = 0 ; i < rows ; i++){
            Arrays.sort(matrix[i]);
            for(int j = 0 ; j < cols ; j++){
                maxArea = Math.max(maxArea, matrix[i][j] * (cols - j));
            }
        }

        return maxArea;
    }
}