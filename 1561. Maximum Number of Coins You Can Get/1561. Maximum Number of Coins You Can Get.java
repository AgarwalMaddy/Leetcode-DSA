import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        if(n == 3){
            return piles[1];
        }

        int me = 0;
        int i = 0 ; int j = n-2;
        while(i < j){
            me += piles[j];
            j -= 2;
            i++;
        }

        return me;
    }
}