class Solution {
    public int integerBreak(int n) {
        if(n <= 3){
            return n - 1;
        }

        int result = 1;
            while(n > 4){
                result = result * 3;
                n = n - 3;
            }

        result = result * n;
        return result;
    }
}