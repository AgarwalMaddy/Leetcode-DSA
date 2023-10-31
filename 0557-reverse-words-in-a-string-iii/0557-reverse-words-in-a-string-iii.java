class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < words.length ; i++){
            StringBuilder temp = new StringBuilder(words[i]);
            temp.reverse();
            if(i != words.length - 1)
                result.append(temp.toString() + " ");
            else
                result.append(temp.toString());
        }
        return result.toString();
    }
}