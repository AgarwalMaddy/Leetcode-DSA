class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        
        for(String s : word1){
            string1.append(s);
        }

        for(String s : word2){
            string2.append(s);
        }

        return string1.compareTo(string2) == 0;

    }
}