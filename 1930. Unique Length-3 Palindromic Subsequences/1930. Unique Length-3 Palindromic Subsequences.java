class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] minIndex = new int[26];
        int[] maxIndex = new int[26];
        for(int i = 0 ; i < 26 ; i++){
            minIndex[i] = Integer.MAX_VALUE;
            maxIndex[i] = Integer.MIN_VALUE;
        }

        for(int i = 0 ; i < s.length() ; i++){
            int charIndex = s.charAt(i) - 'a';
            minIndex[charIndex] = Math.min(minIndex[charIndex], i);
            maxIndex[charIndex] = Math.max(maxIndex[charIndex], i);
        }

        int uniqueCount = 0;

        for(int i = 0 ; i < 26; i++){
            if(minIndex[i] == Integer.MAX_VALUE || maxIndex[i] == Integer.MIN_VALUE){
                continue;
            }

            HashSet<Character> uniqueBetween = new HashSet<>();

            for(int j = minIndex[i] + 1 ; j < maxIndex[i] ; j++){
                uniqueBetween.add(s.charAt(j));
            }

            uniqueCount += uniqueBetween.size();
        }

        return uniqueCount;
    }
}