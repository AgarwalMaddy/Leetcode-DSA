class Solution {
    public int numberOfMatches(int n) {
        return helper(n , 0);
    }
    public int helper(int teams , int matches){
        if(teams == 2){
            return matches + 1;
        }

        if(teams == 1){
            return 0;
        }

        if(teams % 2 == 0){
            matches += teams / 2;
            return helper(teams / 2 , matches);
        }else{
            matches += (teams-1)/2;
            return helper((teams-1)/2+1, matches);
        }
    }
}