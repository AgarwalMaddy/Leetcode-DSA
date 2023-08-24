class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        StringBuilder word = new StringBuilder();
        for(int i = 0 ; i < words.length ; i++){
            word = new StringBuilder();
            word.append(words[i]);
            word.reverse();
            for(int j = i + 1 ; j < words.length ; j++){
                if(word.toString().equals(words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}