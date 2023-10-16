class Solution {
    public String lastSubstring(String s) {
        int n = s.length();
        int maxIndex = n - 1;
        for(int curr = n - 1; curr >= 0 ; curr--){
            if(s.charAt(curr) > s.charAt(maxIndex)){
                maxIndex = curr;
            }else if(s.charAt(curr) == s.charAt(maxIndex)){
                int i = curr + 1;
                int j = maxIndex + 1;
                
                while(i < maxIndex && j < s.length() && s.charAt(i) == s.charAt(j)){
                    i++;
                    j++;
                }
                if(i == maxIndex || j == s.length() || s.charAt(i) > s.charAt(j)){
                    maxIndex = curr;
                }
            }
        }
        return s.substring(maxIndex);
    }
}