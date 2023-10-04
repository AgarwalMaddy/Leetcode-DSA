class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int n = rows * cols;
        
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start)/2;
        
        while(start <= end){
            int rowIndex = mid/cols;
            int colIndex = mid % cols;
            int current = matrix[rowIndex][colIndex];
            
            if(target == current){
                return true;
            }else if(target > current){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            
            mid = start + (end - start)/2;
        }
        
        return false;
    }
}