class Solution {
    public String restoreString(String s, int[] indices) {
        char[] tempArray = new char[indices.length];
        for(int i = 0; i < indices.length ; i++){
            tempArray[indices[i]] = s.charAt(i); 
        }
        
        String result = "";
        for(char c : tempArray){
            result += c;
        }
        
        return result;
    }
}