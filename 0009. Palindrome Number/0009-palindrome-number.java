class Solution {
    public boolean isPalindrome(int x) {
       String s = Integer.toString(x);
       StringBuilder sb = new StringBuilder(s);
       StringBuilder rev = sb.reverse();
       String result = rev.toString();
       if(result.equals(s)){
           return true;
       } 

       return false;
       
    }
}