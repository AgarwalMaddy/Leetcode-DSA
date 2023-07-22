class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int row = 0;
        int resultRow = -1 , maxOne = Integer.MIN_VALUE;
        while(row < rows){
            int col = cols - 1;
            int count = 0;
            while(col >= 0){
                if(mat[row][col] == 1){
                    count++;
                }
                col--;
            }
            if(count != 0 && count > maxOne){
                maxOne = count;
                resultRow = row;
            }
            row++;
        }
        if(resultRow != -1 && maxOne != Integer.MIN_VALUE){
            return new int[]{resultRow , maxOne};
        }
        return new int[]{0,0};
    }
}