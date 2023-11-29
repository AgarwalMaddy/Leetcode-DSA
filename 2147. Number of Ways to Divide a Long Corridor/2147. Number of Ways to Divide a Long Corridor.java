class Solution {
    public int numberOfWays(String corridor) {
        int mod = 1000000007;
        long result = 1;
        long seat = 0 , plant = 0;

        for(char c : corridor.toCharArray()){
            if(c == 'S'){
                if(seat == 2){
                    result = result * (plant + 1) % mod;
                    seat = 0;
                    plant = 0;
                }
                seat++;
            }else if(seat == 2){
                plant++;
            }
        }

        if(seat == 2){
            return (int)result;
        }

        return 0;
    }
}