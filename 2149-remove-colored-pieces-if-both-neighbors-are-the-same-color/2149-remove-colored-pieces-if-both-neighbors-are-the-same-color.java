class Solution {
    public boolean winnerOfGame(String colors) {
        int count = 0;
        int n = colors.length();
        for(int i = 2 ; i < n ; i++){
            if(colors.charAt(i-2) + colors.charAt(i-1) + colors.charAt(i) == 'A' * 3){
                count++;
            }else if(colors.charAt(i-2) + colors.charAt(i-1) + colors.charAt(i) == 'B' * 3){
                count--;
            }
        }

        return count > 0;
    }
}