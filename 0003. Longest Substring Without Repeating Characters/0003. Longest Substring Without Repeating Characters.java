class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int n = s.length();
        String check = s.charAt(0) + "";
        int minLength = check.length();
        int maxLength = Integer.MIN_VALUE;
        int index = 1;
        for(int i = 1 ; i < n ; i++){
            if(!check.contains(s.charAt(i) + "")){
                check += s.charAt(i) + "";
                minLength = check.length();
            }else{
                if(maxLength < minLength){
                    maxLength = minLength;
                }
                check = s.charAt(index) + "";
                i = index;
                index++;
            }
        }

        return Math.max(minLength, maxLength);
    }
}