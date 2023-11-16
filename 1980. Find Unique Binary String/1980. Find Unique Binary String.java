class Solution {
    public String findDifferentBinaryString(String[] arr) {
        int n = arr.length;
        String result = "";
        for(int i = 0 ; i < n ; i++){
            String temp = arr[i];
            if(temp.charAt(i) == '0'){
                result += '1';
            }else{
                result += '0';
            }
        }
        return result;
    }
}