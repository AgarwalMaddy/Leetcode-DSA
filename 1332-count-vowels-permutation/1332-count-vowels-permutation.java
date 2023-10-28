class Solution {
    public int countVowelPermutation(int n) {
        int MOD = 1000000007;
        long countA = 1 , countE = 1 , countI = 1 , countO = 1 , countU = 1;
        for(int i = 1 ; i < n ; i++){
            long newCountA = countE;
            long newCountE = (countA +  countI) % MOD;
            long newCountI = (countA + countE + countO + countU) % MOD;
            long newCountO = (countI + countU) % MOD;
            long newCountU = countA;

            countA = newCountA;
            countE = newCountE;
            countI = newCountI;
            countO = newCountO;
            countU = newCountU;
        }


        return (int)((countA + countE + countI + countO + countU) % MOD);
    }
}