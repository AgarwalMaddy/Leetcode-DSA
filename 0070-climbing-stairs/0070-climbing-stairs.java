class Solution {
    public int climbStairs(int n) {
        int f1 = 1 , f2 = 1 , ways = 0;
        int i = 2;
        if(n == 1 || n == 2){
            return n;
        }
        else {
            while(i <= n){
                ways = f1 + f2;
                f1 = f2;
                f2 = ways;
                i++;
            }
        }

        return ways;
    }
}